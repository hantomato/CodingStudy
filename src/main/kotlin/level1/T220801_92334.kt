package level1

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/92334
 */
fun main() {

//    ["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
//    ["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]

    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {

        // 1. 사용자별 신고당한 횟수 테이블 생성 (신고 횟수 2회 미만은 제거되어도 됨)

        val abuseUsers = report.map { it.split(" ") }
            .distinct()
            .groupBy { it.last() }              // {frodo=[[muzi, frodo], [apeach, frodo]], neo=[[frodo, neo], [muzi, neo]], muzi=[[apeach, muzi]]}
            .filter { it.value.size >= k }      // {frodo=[[muzi, frodo], [apeach, frodo]], neo=[[frodo, neo], [muzi, neo]]}
            .map { it.key }                     // [frodo, neo]

        val reportTable: Map<String, List<String>> = report.map { it.split(" ") }  // {muzi=[[muzi, frodo], [muzi, neo]], apeach=[[apeach, frodo], [apeach, muzi]], frodo=[[frodo, neo]]}
            .distinct()
            .groupBy( { it.first() }, { it.last() })                // {muzi=[frodo, neo], apeach=[frodo, muzi], frodo=[neo]}

//        println(abuseUsers)
//        println(reportTable)

        return id_list.map { id ->
            reportTable.getOrDefault(id, listOf())
                .filter { abuseUsers.contains(it) }
                .size
        }.toIntArray()
    }

    fun solution2(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val reportCountTable: MutableMap<String, Int> = id_list.map { it to 0 }.toMap().toMutableMap()
        val reportTable: MutableMap<String, ArrayList<String>> = id_list.map { Pair(it, arrayListOf<String>()) }.toMap().toMutableMap()

        report.forEach {
            val data = it.split(" ")
            val name = data.first()
            val target = data.last()
            if (reportTable.containsKey(name)) {
                if (reportTable[name]?.contains(target) == false) {
                    reportTable[name]?.add(target)
                    reportCountTable[target] = reportCountTable[target]!! + 1
                }
            }
        }

        val result = id_list.map {
            val size:Int = reportTable[it]?.filter { blockId ->
                reportCountTable[blockId]!! >= k
            }!!.size
            size
        }.toIntArray()
        return result
    }

//    ["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
//    ["con", "ryan"]	["ryan con", "ryan con", "ryan con", "ryan con"]	3	[0,0]

    val param1 = arrayOf("muzi", "frodo", "apeach", "neo")
    val param2 = arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi")
    println(solution(param1, param2, 2).toList())

    val param10 = arrayOf("con", "ryan")
    val param20 = arrayOf("ryan con", "ryan con", "ryan con", "ryan con")
    println(solution(param10, param20, 3).toList())
}


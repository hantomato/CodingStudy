package level1

/**
 * 하노이의 탑
 * https://www.youtube.com/watch?v=FYCGV6F1NuY
 * https://school.programmers.co.kr/learn/courses/30/lessons/12946
 *
 */
fun main() {
    // src : 초기 위치
    // dst : 옮겨야햘 대상 위치
    // temp : 임시용 위치
    fun hanoi(record: ArrayList<IntArray>, number: Int, src: Int, dst: Int, temp: Int) {
        if (number == 1) {
            record.add(intArrayOf(src, dst))
            return
        }

        hanoi(record, number - 1, src, temp, dst)
        record.add(intArrayOf(src, dst))
        hanoi(record, number - 1, temp, dst, src)
    }


    fun solution(n: Int): Array<IntArray> {
        val record = arrayListOf<IntArray>()
        hanoi(record, n, 1, 3, 2)
        return record.toTypedArray()
    }

//    n	result
//    2	[ [1,2], [1,3], [2,3] ]

    val ret = solution(2)
    for (i in ret) {
        println(i.toList())
    }

}


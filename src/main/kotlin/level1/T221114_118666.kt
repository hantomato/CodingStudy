package level1

/**
 * 성격 유형 검사하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/118666
 *
 */
fun main() {

    // 코딩 시작 11:33 - 12:10
    fun solution(survey: Array<String>, choices: IntArray): String {

        val table = arrayOf("RT", "CF", "JM", "AN")
        val result = IntArray(4)

        fun getIndex(str: String) = when (str) {
            "RT", "TR" -> 0
            "CF", "FC" -> 1
            "JM", "MJ" -> 2
            else -> 3
        }

        // 왼쪽이면 플러스, 오른쪽이면 마이너스
        survey.zip(choices.asIterable())
            .forEach {
                println(it)
                var plus = (it.second - 4)
                if (table.indexOf(it.first) == -1) // 역순이면
                    plus *= -1
                result[getIndex(it.first)] += plus
            }

        return result.zip(table.asIterable())
            .map {
                if (it.first > 0) {
                    it.second[1]
                } else {
                    it.second[0]
                }
            }.joinToString("")
    }

//    테스트 1 〉	통과 (31.18ms, 67.5MB)
//    테스트 2 〉	통과 (28.86ms, 67.7MB)
//    테스트 3 〉	통과 (35.70ms, 68MB)
//    테스트 4 〉	통과 (29.98ms, 67.2MB)
//    테스트 5 〉	통과 (42.84ms, 68MB)
//    테스트 6 〉	통과 (28.23ms, 68.1MB)
//    테스트 7 〉	통과 (38.31ms, 67.5MB)
//    테스트 8 〉	통과 (41.09ms, 68.1MB)
//    테스트 9 〉	통과 (35.60ms, 67.7MB)
//    테스트 10 〉	통과 (38.84ms, 67.9MB)
//    테스트 11 〉	통과 (37.03ms, 67.5MB)
//    테스트 12 〉	통과 (31.16ms, 68.8MB)
//    테스트 13 〉	통과 (39.54ms, 67.4MB)
//    테스트 14 〉	통과 (36.11ms, 68.5MB)
//    테스트 15 〉	통과 (38.02ms, 68.9MB)
//    테스트 16 〉	통과 (42.04ms, 69.6MB)
//    테스트 17 〉	통과 (35.42ms, 68.2MB)
//    테스트 18 〉	통과 (37.78ms, 68.4MB)
//    테스트 19 〉	통과 (50.92ms, 68.3MB)
//    테스트 20 〉	통과 (50.78ms, 68.6MB)

//    survey	                        choices	            result
//    ["AN", "CF", "MJ", "RT", "NA"]	[5, 3, 2, 7, 5]	    "TCMA"
//    ["TR", "RT", "TR"]	            [7, 1, 3]	        "RCJA"

    println(solution(arrayOf("AN", "CF", "MJ", "RT", "NA"), intArrayOf(5, 3, 2, 7, 5)))
    println(solution(arrayOf("TR", "RT", "TR"), intArrayOf(7, 1, 3)))

}


package level1

/**
 * 5
 * 최댓값과 최솟값
 * https://school.programmers.co.kr/learn/courses/30/lessons/12939
 *
 */
fun main() {

    fun solution(s: String): String {
        return s.split(" ")
            .map { it.toInt() }
            .let {
                "${it.minOrNull()} ${it.maxOrNull()}"
            }
    }


//    s	return
//    "1 2 3 4"	"1 4"
//    "-1 -2 -3 -4"	"-4 -1"
//    "-1 -1"	"-1 -1"

    println(solution("1 2 3 4"))
    println(solution("-1 -2 -3 -4"))
    println(solution("-1 -1"))

}


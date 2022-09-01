package level1

/**
 *
 * 짝수와 홀수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12937
 *
 */
fun main() {

    fun solution(num: Int): String {
        return if (num % 2 == 0) "Even" else "Odd"
    }

//    3	"Odd"
//    4	"Even"

    println(solution(3))
    println(solution(4))

}


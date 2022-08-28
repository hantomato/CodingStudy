package level1

/**
 * 두 정수 사이의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12912
 *
 */
fun main() {

    fun solution(a: Int, b: Int): Long {
        if (a == b) {
            return a.toLong()
        }

        val min = kotlin.math.min(a,b)
        val max = kotlin.math.max(a,b)
        var sum = 0L
        for (i in min .. max) {
            sum += i
        }
        return sum
    }

//    3	5	12
//    3	3	3
//    5	3	12

    println(solution(3, 5))
    println(solution(3, 3))
    println(solution(5, 3))

}


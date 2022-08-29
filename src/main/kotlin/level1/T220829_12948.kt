package level1

/**
 *
 * 체육복
 * https://school.programmers.co.kr/learn/courses/30/lessons/42862
 *
 */
fun main() {

    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        return answer
    }

//    5	    [2, 4]	    [1, 3, 5]	5
//    5	    [2, 4]	    [3]	        4
//    3	    [3]	        [1]	        2

    println(solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5)))
    println(solution(5, intArrayOf(2, 4), intArrayOf(3)))
    println(solution(3, intArrayOf(3), intArrayOf(1)))


}


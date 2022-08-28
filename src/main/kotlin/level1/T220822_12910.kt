package level1

/**
 * 나누어 떨어지는 숫자 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */
fun main() {

//    [5, 9, 7, 10]	5	[5, 10]
//    [2, 36, 1, 3]	1	[1, 2, 3, 36]
//    [3,2,6]	    10	[-1]

    fun solution(arr: IntArray, divisor: Int): IntArray {
        val ret = arr.filter { it % divisor == 0 }
            .sorted()
            .toIntArray()
        return if (ret.isNotEmpty()) {
            ret
        } else {
            intArrayOf(-1)
        }
    }

    println(solution(intArrayOf(5, 9, 7, 10), 5).toList())
    println(solution(intArrayOf(2, 36, 1, 3), 1).toList())
    println(solution(intArrayOf(3,2,6), 10).toList())


}


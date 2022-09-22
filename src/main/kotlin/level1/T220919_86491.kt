package level1

import kotlin.math.max

/**
 * 최소직사각형
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 *
 */
fun main() {

    fun solution(sizes: Array<IntArray>): Int {
        return sizes.fold(0 to 0) { acc, c ->
            var land = acc.first
            var port = acc.second

            val size1 = max(land, c[0]) * max(port, c[1])
            val size2 = max(land, c[1]) * max(port, c[0])
            if (size1 < size2) {
                land = max(land, c[0])
                port = max(port, c[1])
            } else {
                land = max(land, c[1])
                port = max(port, c[0])
            }

            land to port
        }.let {
            it.first * it.second
        }
    }

//    테스트 1 〉	통과 (0.53ms, 64.6MB)
//    테스트 2 〉	통과 (0.52ms, 63.3MB)
//    테스트 3 〉	통과 (0.60ms, 62.8MB)
//    테스트 4 〉	통과 (0.53ms, 63.7MB)


//    sizes	result
//    [[60, 50], [30, 70], [60, 30], [80, 40]]	4000
//    [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
//    [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133

    println(solution(arrayOf(intArrayOf(60,50), intArrayOf(30,70), intArrayOf(60,30), intArrayOf(80,40))))
    println(solution(arrayOf(intArrayOf(10,7), intArrayOf(12,3), intArrayOf(8,15), intArrayOf(14,7), intArrayOf(5,15))))
    println(solution(arrayOf(intArrayOf(14,4), intArrayOf(19,6), intArrayOf(6,16), intArrayOf(18,7), intArrayOf(7,11))))

}


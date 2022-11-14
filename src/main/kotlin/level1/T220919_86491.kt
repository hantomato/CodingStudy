package level1

import kotlin.math.max

/**
 * 최소직사각형
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 *
 */
fun main() {

    fun solution(sizes: Array<IntArray>): Int {
        sizes.maxOf {
            it[0]
        }

        return sizes.map {
            if (it[0] > it[1]) {
                it[1] to it[0]
            } else {
                it[0] to it[1]
            }
        }.unzip()
            .let {
                (it.first.maxOrNull() ?: 0) * (it.second.maxOrNull() ?: 0)
            }
    }

//    sizes	result
//    [[60, 50], [30, 70], [60, 30], [80, 40]]	4000
//    [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
//    [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133

    println(solution(arrayOf(intArrayOf(60,50), intArrayOf(30,70), intArrayOf(60,30), intArrayOf(80,40))))
    println(solution(arrayOf(intArrayOf(10,7), intArrayOf(12,3), intArrayOf(8,15), intArrayOf(14,7), intArrayOf(5,15))))
    println(solution(arrayOf(intArrayOf(14,4), intArrayOf(19,6), intArrayOf(6,16), intArrayOf(18,7), intArrayOf(7,11))))

}


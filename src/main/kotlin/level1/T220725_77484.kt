package level1

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/77484
 */
fun main() {

    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        fun Int.toRanking() = when (this) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }

        val worst = lottos.intersect(win_nums.asIterable().toSet()).size
        val best = worst + lottos.filter { it == 0 }.size
        return intArrayOf(best.toRanking(), worst.toRanking())
    }

    fun solution2(lottos: IntArray, win_nums: IntArray): IntArray {
        fun Int.toRanking() = if (this == 0) 6 else 7 - this
        val worst = win_nums.count { lottos.contains(it) }
        val best = worst + lottos.count { it == 0}
        return intArrayOf(best.toRanking(), worst.toRanking())
    }

//    [44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
//    [0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
//    [45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	[1, 1]

    println(solution(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)).toList())
    println(solution(intArrayOf(0, 0, 0, 0, 0, 0), intArrayOf(38, 19, 20, 40, 15, 25)).toList())
    println(solution(intArrayOf(45, 4, 35, 20, 3, 9), intArrayOf(20, 9, 3, 45, 4, 35)).toList())
}


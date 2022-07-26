package level1

import kotlin.math.max

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42840
 */
fun main() {

    // ref : kotlin sequence https://incheol-jung.gitbook.io/docs/study/undefined-2/6
    fun solution(answers: IntArray): IntArray {
        fun makeList(input: List<Int>): List<Int> {
            return generateSequence {
                input
            }.take((answers.size / input.size) + 1)
                .flatMap { it }
                .toList()
        }

        val person1 = makeList(listOf(1,2,3,4,5))
        val person2 = makeList(listOf(2,1,2,3,2,4,2,5))
        val person3 = makeList(listOf(3,3,1,1,2,2,4,4,5,5))

        val sortedList = listOf(
            1 to answers.filterIndexed { index, i -> person1[index] == i }.count(),
            2 to answers.filterIndexed { index, i -> person2[index] == i }.count(),
            3 to answers.filterIndexed { index, i -> person3[index] == i }.count()
        ).sortedByDescending { it.second }

        val max = sortedList.get(0).second
        return sortedList.filter { it.second >= max }
            .map { it.first }
            .toIntArray()
    }

//    [1,2,3,4,5]	[1]
//    [1,3,2,4,2]	[1,2,3]

    println(solution(intArrayOf(1,2,3,4,5)).toList())
    println(solution(intArrayOf(1,3,2,4,2)).toList())

}


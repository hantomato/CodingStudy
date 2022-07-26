package level1

// https://school.programmers.co.kr/learn/courses/30/lessons/42748
fun main() {


    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map {
            array.slice(IntRange(it[0]-1, it[1]-1)).sorted()[it[2]-1]
        }.toIntArray()
    }

    val temp = solution(intArrayOf(1, 5, 2, 6, 3, 7, 4),
        arrayOf(intArrayOf(2, 5, 3),
            intArrayOf(4, 4, 1),
            intArrayOf(1, 7, 3)))
    println(temp.toList())

//    [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]

}


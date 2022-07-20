package level1

// https://school.programmers.co.kr/learn/courses/30/lessons/42748
fun main() {
    println("Hello World! 22")

    val mm = solution(intArrayOf(1, 5, 2, 6, 3, 7, 4),
        arrayOf(intArrayOf(2, 5, 3),
            intArrayOf(4, 4, 1),
            intArrayOf(1, 7, 3)))
    println(mm.toList())
}

fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    return commands.map { com ->
        array.toList()
            .slice(IntRange(com[0]-1, com[1]))
            .sorted()
            .get(com[2]-1)
    }.toIntArray()
}
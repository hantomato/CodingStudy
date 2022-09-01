package level1

/**
 *
 * 수박수박수박수박수박수?
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 *
 */
fun main() {

    fun solution(n: Int): String {
        val sb = StringBuffer(n)
        for (idx in 1 .. n) {
            if (idx % 2 == 0) {
                sb.append('박')
            } else {
                sb.append('수')
            }
        }
        return sb.toString()
    }

//    fun solution2(n: Int): String = String(CharArray(n, { i -> if (i % 2 == 0) '수' else '박' }))
//    3	    "수박수"
//    4	    "수박수박"

    println(solution(3))
    println(solution(4))


}


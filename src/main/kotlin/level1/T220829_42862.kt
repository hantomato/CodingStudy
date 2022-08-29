package level1

/**
 *
 * 수박수박수박수박수박수?
 * https://school.programmers.co.kr/learn/courses/30/lessons/12922
 *
 */
fun main() {

    fun solution(s: String): Boolean {
        val ret = s.count { !it.isDigit() }
        return (ret == 0 && (s.length == 4 || s.length == 6))
    }

//    "a234"	false
//    "1234"	true

    println(solution("a234"))
    println(solution("1234"))


}


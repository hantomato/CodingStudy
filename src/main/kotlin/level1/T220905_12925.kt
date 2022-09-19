package level1

/**
 * 문자열을 정수로 바꾸기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12925
 *
 */
fun main() {

    fun solution(s: String): Int {
        return s.toInt()
    }

//    "1234"      1234
//    "-1234"     -1234

    println(solution("1234"))
    println(solution("-1234"))

}


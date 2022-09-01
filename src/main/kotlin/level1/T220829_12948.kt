package level1

/**
 *
 * 핸드폰 번호 가리기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 *
 */
fun main() {

    fun solution(phone_number: String): String {
        return "*".repeat(phone_number.length - 4) + phone_number.takeLast(4)
    }

//    테스트 1 〉	통과 (10.02ms, 62.9MB)
//    테스트 2 〉	통과 (10.01ms, 64.7MB)
//    테스트 3 〉	통과 (14.48ms, 63MB)
//    테스트 4 〉	통과 (10.37ms, 64.4MB)
//    테스트 5 〉	통과 (12.10ms, 63.4MB)
//    테스트 6 〉	통과 (9.80ms, 62.9MB)
//    테스트 7 〉	통과 (10.01ms, 64.2MB)
//    테스트 8 〉	통과 (9.88ms, 63.2MB)
//    테스트 9 〉	통과 (10.20ms, 62.4MB)
//    테스트 10 〉	통과 (10.55ms, 64.5MB)
//    테스트 11 〉	통과 (10.69ms, 63.5MB)
//    테스트 12 〉	통과 (14.15ms, 63.4MB)
//    테스트 13 〉	통과 (10.14ms, 64.2MB)

    fun solution2(phone_number: String): String {
        return "${"".padStart(phone_number.length - 4, '*')}${phone_number.takeLast(4)}"
    }

//    "01033334444"	"*******4444"
//    "027778888"	"*****8888"

    println(solution("01033334444"))
    println(solution("027778888"))


}


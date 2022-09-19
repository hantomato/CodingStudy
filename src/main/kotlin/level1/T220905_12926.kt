package level1

/**
 * 시저 암호
 * https://school.programmers.co.kr/learn/courses/30/lessons/12926
 *
 */
fun main() {

    fun solution(s: String, n: Int): String {

//        var aaa: Char = 'A' // 65
//        var bbb: Char = 'Z' // 90
//        var ccc: Char = 'a' // 97
//        var ddd: Char = 'z' // 122

        return s.map {
            val new = when (it) {
                in 'A' .. 'Z' -> {
                    if (it + n <= 'Z') {
                        it + n
                    } else {
                        'A' + (n - ('Z' - it + 1))
                    }
                }
                in 'a' .. 'z' -> {
                    if (it + n <= 'z') {
                        it + n
                    } else {
                        'a' + (n - ('z' - it + 1))
                    }
                }
                else -> it
            }
            new
        }.joinToString("")
    }

//    테스트 1 〉	통과 (15.41ms, 64.6MB)
//    테스트 2 〉	통과 (18.72ms, 64.6MB)
//    테스트 3 〉	통과 (15.70ms, 64.3MB)
//    테스트 4 〉	통과 (18.27ms, 63.4MB)
//    테스트 5 〉	통과 (17.35ms, 66.1MB)
//    테스트 6 〉	통과 (12.66ms, 64.7MB)
//    테스트 7 〉	통과 (17.43ms, 64.3MB)
//    테스트 8 〉	통과 (13.05ms, 65.2MB)
//    테스트 9 〉	통과 (12.62ms, 66.5MB)
//    테스트 10 〉	통과 (12.23ms, 63.9MB)
//    테스트 11 〉	통과 (13.49ms, 65.1MB)
//    테스트 12 〉	통과 (12.21ms, 64.6MB)
//    테스트 13 〉	통과 (17.86ms, 65.3MB)

//    "AB"	    1	"BC"
//    "z"	    1	"a"
//    "a B z"	4	"e F d"

    println(solution("AB", 1))
    println(solution("z", 1))
    println(solution("a B z", 4))

}


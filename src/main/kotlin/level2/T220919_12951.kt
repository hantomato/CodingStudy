package level1

/**
 * x
 * JadenCase 문자열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12951
 *
 */
fun main() {

    fun solution(s: String): String {
        return s.lowercase()
            .split(" ")
            .map {
                if (it.isNotEmpty()) {
                    it[0].uppercase() + it.substring(1 until it.length)
                } else it
            }
            .joinToString(" ")

    }

//    테스트 1 〉	통과 (19.37ms, 65.3MB)
//    테스트 2 〉	통과 (21.47ms, 65.3MB)
//    테스트 3 〉	통과 (18.67ms, 63.9MB)
//    테스트 4 〉	통과 (16.89ms, 65.7MB)
//    테스트 5 〉	통과 (16.97ms, 65.7MB)

    fun solutionOne(s: String): String {
        return s.split(" ")
            .map { it.capitalize() }
            .joinToString(" ")
    }

    fun solutionTwo(s: String): String {
        return s.lowercase()
            .split(" ")
            .map {
                it.replaceFirstChar { it.uppercase() }
            }
            .joinToString(" ")
    }
//    테스트 1 〉	통과 (13.29ms, 64.4MB)
//    테스트 2 〉	통과 (13.16ms, 64.5MB)
//    테스트 3 〉	통과 (18.02ms, 64.4MB)
//    테스트 4 〉	통과 (13.55ms, 64.8MB)

//    s	return
//    "3people unFollowed me"	"3people Unfollowed Me"
//    "for the last week"	"For The Last Week"

    println(solution("3people unFollowed me"))
    println(solution("for the last week"))

}


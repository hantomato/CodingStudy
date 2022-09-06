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

//    테스트 1 〉	통과 (1.03ms, 60.8MB)
//    테스트 2 〉	통과 (1.03ms, 63MB)
//    테스트 3 〉	통과 (1.81ms, 61.4MB)
//    테스트 4 〉	통과 (0.74ms, 61.9MB)
//    테스트 5 〉	통과 (0.53ms, 63.4MB)
//    테스트 6 〉	통과 (0.10ms, 62.2MB)
//    테스트 7 〉	통과 (0.12ms, 63.4MB)
//    테스트 8 〉	통과 (0.13ms, 63.2MB)
//    테스트 9 〉	통과 (0.20ms, 63.5MB)
//    테스트 10 〉	통과 (0.14ms, 62.4MB)
//    테스트 11 〉	통과 (0.15ms, 62.1MB)
//    테스트 12 〉	통과 (0.14ms, 60.8MB)
//    테스트 13 〉	통과 (0.19ms, 61MB)
//    테스트 14 〉	통과 (0.20ms, 64.7MB)
//    테스트 15 〉	통과 (6.97ms, 60.9MB)
//    테스트 16 〉	통과 (0.13ms, 62.4MB)

    fun solution2(n: Int): String = String(CharArray(n, { i -> if (i % 2 == 0) '수' else '박' }))
//    3	    "수박수"
//    4	    "수박수박"

    println(solution(3))
    println(solution(4))


}


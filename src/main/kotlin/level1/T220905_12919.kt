package level1

/**
 * 서울에서 김서방 찾기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12919
 *
 */
fun main() {

    // Big-O : O(N)
    fun solution(seoul: Array<String>): String {
         val idx = seoul.mapIndexed { index, s -> if (s == "Kim") index else -1 }
            .first { it >= 0 }
        return "김서방은 ${idx}에 있다"
    }

//    테스트 1 〉	통과 (6.06ms, 63.3MB)
//    테스트 2 〉	통과 (7.07ms, 62.6MB)
//    테스트 3 〉	통과 (6.09ms, 62.8MB)
//    테스트 4 〉	통과 (6.42ms, 63.6MB)
//    테스트 5 〉	통과 (9.15ms, 63.7MB)
//    테스트 6 〉	통과 (6.14ms, 63.2MB)
//    테스트 7 〉	통과 (6.21ms, 62.7MB)
//    테스트 8 〉	통과 (6.11ms, 63MB)
//    테스트 9 〉	통과 (6.60ms, 63.3MB)
//    테스트 10 〉	통과 (6.38ms, 63.3MB)
//    테스트 11 〉	통과 (6.37ms, 64.2MB)
//    테스트 12 〉	통과 (6.36ms, 63.9MB)
//    테스트 13 〉	통과 (6.94ms, 63.8MB)
//    테스트 14 〉	통과 (6.37ms, 63.9MB)

    // 다른 사람 1위
    fun solutionOne(seoul: Array<String>): String {
        return "김서방은 ${seoul.indexOf("Kim")}에 있다"
    }

//    테스트 1 〉	통과 (19.74ms, 65.4MB)
//    테스트 2 〉	통과 (23.46ms, 66.1MB)
//    테스트 3 〉	통과 (21.55ms, 65.4MB)
//    테스트 4 〉	통과 (28.83ms, 65.2MB)
//    테스트 5 〉	통과 (21.02ms, 66MB)
//    테스트 6 〉	통과 (19.96ms, 65.6MB)
//    테스트 7 〉	통과 (21.49ms, 65.9MB)
//    테스트 8 〉	통과 (24.26ms, 65.3MB)
//    테스트 9 〉	통과 (20.33ms, 65.3MB)
//    테스트 10 〉	통과 (19.26ms, 65.3MB)
//    테스트 11 〉	통과 (21.22ms, 66MB)
//    테스트 12 〉	통과 (19.72ms, 65.6MB)
//    테스트 13 〉	통과 (19.66ms, 66.3MB)
//    테스트 14 〉	통과 (20.72ms, 65.7MB)

    // ["Jane", "Kim"]	"김서방은 1에 있다"

    println(solution(arrayOf("Jane","Jane2","Jane3","Kim","Jane5", "Kim2")))
    println(solution(arrayOf("Jane", "Kim")))
    println(solution(arrayOf("Kim")))

}


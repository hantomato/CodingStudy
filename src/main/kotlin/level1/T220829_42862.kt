package level1

/**
 * 탐욕법
 * 체육복
 * https://school.programmers.co.kr/learn/courses/30/lessons/42862
 *
 */
fun main() {

    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val students = IntArray(n) { 1 }   // 모든 학생은 체육복 1개씩 가지고 있음

        reserve.forEach {
            students[it-1]++        // 여유 체육복 있다면 1 증가
        }

        lost.forEach {
            students[it-1]--        // 도난당했다면 1 감소
        }

        students.forEachIndexed { index, i ->
            if (i == 0) {
                if (index > 0) {
                    if (students[index - 1] > 1) {  // 앞에꺼 체크
                        students[index - 1]--
                        students[index]++
                    } else if (index + 1 < students.size && students[index + 1] > 1) {  // 뒤에꺼 체크
                        students[index + 1]--
                        students[index]++
                    }
                } else {
                    if (students[index + 1] > 1) {  // 뒤에꺼 체크
                        students[index + 1]--
                        students[index]++
                    }
                }
            }
        }

        return students.filter { it > 0 }.size
    }

//    테스트 1 〉	통과 (0.05ms, 64.9MB)
//    테스트 2 〉	통과 (0.05ms, 63.3MB)
//    테스트 3 〉	통과 (0.05ms, 62.1MB)
//    테스트 4 〉	통과 (0.04ms, 64.6MB)
//    테스트 5 〉	통과 (0.07ms, 61.8MB)
//    테스트 6 〉	통과 (0.05ms, 62.9MB)
//    테스트 7 〉	통과 (0.08ms, 62.4MB)
//    테스트 8 〉	통과 (0.04ms, 65.1MB)
//    테스트 9 〉	통과 (0.04ms, 61.2MB)
//    테스트 10 〉	통과 (0.08ms, 62.4MB)
//    테스트 11 〉	통과 (0.06ms, 63.8MB)
//    테스트 12 〉	통과 (0.03ms, 63.6MB)
//    테스트 13 〉	통과 (0.03ms, 63.9MB)
//    테스트 14 〉	통과 (0.03ms, 60.5MB)
//    테스트 15 〉	통과 (0.03ms, 64.4MB)
//    테스트 16 〉	통과 (0.03ms, 64.8MB)
//    테스트 17 〉	통과 (0.04ms, 62.9MB)
//    테스트 18 〉	통과 (0.03ms, 64.5MB)
//    테스트 19 〉	통과 (0.05ms, 64.9MB)
//    테스트 20 〉	통과 (0.05ms, 63.9MB)

    fun solution2(n: Int, lost: IntArray, reserve: IntArray): Int {

        var answer = n
        var lostSet = lost.toSet() - reserve.toSet()
        var reserveSet = (reserve.toSet() - lost.toSet()) as MutableSet

        for (i in lostSet) {
            when {
                i + 1 in reserveSet -> reserveSet.remove(i + 1)
                i - 1 in reserveSet -> reserveSet.remove(i - 1)
                else -> answer--
            }
        }
        return answer
    }

//    테스트 1 〉	통과 (17.74ms, 65.7MB)
//    테스트 2 〉	통과 (17.62ms, 65.9MB)
//    테스트 3 〉	통과 (18.34ms, 66.2MB)
//    테스트 4 〉	통과 (18.99ms, 65.9MB)
//    테스트 5 〉	통과 (19.14ms, 65.6MB)
//    테스트 6 〉	통과 (19.14ms, 65.8MB)
//    테스트 7 〉	통과 (19.35ms, 65.5MB)
//    테스트 8 〉	통과 (18.94ms, 65MB)
//    테스트 9 〉	통과 (20.42ms, 65.6MB)
//    테스트 10 〉	통과 (18.27ms, 65.7MB)
//    테스트 11 〉	통과 (18.49ms, 65.7MB)
//    테스트 12 〉	통과 (18.44ms, 66.4MB)
//    테스트 13 〉	통과 (17.55ms, 66.1MB)
//    테스트 14 〉	통과 (18.07ms, 65.6MB)
//    테스트 15 〉	통과 (18.16ms, 66.1MB)
//    테스트 16 〉	통과 (18.20ms, 66MB)
//    테스트 17 〉	실패 (29.52ms, 65.9MB)  *****
//    테스트 18 〉	실패 (22.06ms, 65.8MB) *****
//    테스트 19 〉	통과 (26.01ms, 65.8MB)
//    테스트 20 〉	통과 (26.39ms, 65.5MB)

//    5	    [2, 4]	[1, 3, 5]	5
//    5	    [2, 4]	[3]	        4
//    3	    [3]	    [1]	        2

    println(solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5)))
    println(solution(5, intArrayOf(2, 4), intArrayOf(3)))
    println(solution(3, intArrayOf(3), intArrayOf(1)))


}


package level1

/**
 * 부족한 금액 계산하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/82612
 *
 */
fun main() {

    // big-O : O(N)
    fun solution(price: Int, money: Int, count: Int): Long {
        var total = 0L
        for (num in 1 .. count) {
            total += (price * num)
        }

        return if (total > money) {
            (total - money)
        } else {
            0L
        }
    }

//    테스트 1 〉	통과 (0.05ms, 62.7MB)
//    테스트 2 〉	통과 (0.14ms, 64.1MB)
//    테스트 3 〉	통과 (0.05ms, 64.7MB)
//    테스트 4 〉	통과 (0.08ms, 63.7MB)
//    테스트 5 〉	통과 (0.06ms, 63.6MB)
//    테스트 6 〉	통과 (0.05ms, 62.7MB)
//    테스트 7 〉	통과 (0.05ms, 63.4MB)
//    테스트 8 〉	통과 (0.05ms, 63.2MB)
//    테스트 9 〉	통과 (0.05ms, 62.5MB)
//    테스트 10 〉	통과 (0.05ms, 62.5MB)
//    테스트 11 〉	통과 (0.05ms, 62.1MB)
//    테스트 12 〉	통과 (0.11ms, 63.6MB)
//    테스트 13 〉	통과 (0.06ms, 63.6MB)
//    테스트 14 〉	통과 (0.06ms, 63.8MB)
//    테스트 15 〉	통과 (0.14ms, 63MB)
//    테스트 16 〉	통과 (0.06ms, 63.8MB)
//    테스트 17 〉	통과 (0.06ms, 62.7MB)
//    테스트 18 〉	통과 (0.12ms, 62.1MB)
//    테스트 19 〉	통과 (0.10ms, 63.9MB)
//    테스트 20 〉	통과 (0.08ms, 62.9MB)
//    테스트 21 〉	통과 (0.09ms, 63.3MB)
//    테스트 22 〉	통과 (0.08ms, 63.9MB)
//    테스트 23 〉	통과 (0.16ms, 62MB)

    fun solution2(price: Int, money: Int, count: Int): Long {
        return (1..count).fold(0L) { acc, i ->
            acc + (price * i)
        }.let {
            if (it > money) {
                (it - money)
            } else {
                0L
            }
        }
    }

//    테스트 1 〉	통과 (1.77ms, 62.5MB)
//    테스트 2 〉	통과 (2.67ms, 62.9MB)
//    테스트 3 〉	통과 (1.92ms, 64MB)
//    테스트 4 〉	통과 (3.06ms, 62MB)
//    테스트 5 〉	통과 (1.97ms, 63.6MB)
//    테스트 6 〉	통과 (2.72ms, 62.8MB)
//    테스트 7 〉	통과 (2.82ms, 60.7MB)
//    테스트 8 〉	통과 (2.30ms, 62.4MB)
//    테스트 9 〉	통과 (1.95ms, 63.2MB)
//    테스트 10 〉	통과 (2.20ms, 63.2MB)
//    테스트 11 〉	통과 (1.82ms, 62.5MB)
//    테스트 12 〉	통과 (1.92ms, 63.2MB)
//    테스트 13 〉	통과 (2.92ms, 63MB)
//    테스트 14 〉	통과 (2.31ms, 63.9MB)
//    테스트 15 〉	통과 (2.09ms, 64.8MB)
//    테스트 16 〉	통과 (1.93ms, 64MB)
//    테스트 17 〉	통과 (1.93ms, 63.7MB)
//    테스트 18 〉	통과 (2.37ms, 63.1MB)
//    테스트 19 〉	통과 (2.13ms, 62.7MB)
//    테스트 20 〉	통과 (2.17ms, 63.4MB)
//    테스트 21 〉	통과 (2.08ms, 64.7MB)
//    테스트 22 〉	통과 (2.34ms, 63.1MB)
//    테스트 23 〉	통과 (1.97ms, 62.7MB)

    fun solutionOne(price: Int, money: Int, count: Int): Long
            = (1..count).map { it * price.toLong() }.sum().let { if (money > it) 0 else it - money }

//    테스트 1 〉	통과 (8.25ms, 63.6MB)
//    테스트 2 〉	통과 (12.01ms, 63.7MB)
//    테스트 3 〉	통과 (10.02ms, 63.6MB)
//    테스트 4 〉	통과 (8.71ms, 64.3MB)
//    테스트 5 〉	통과 (12.36ms, 64.4MB)
//    테스트 6 〉	통과 (10.21ms, 63.7MB)
//    테스트 7 〉	통과 (10.18ms, 64.1MB)
//    테스트 8 〉	통과 (10.99ms, 63MB)
//    테스트 9 〉	통과 (9.57ms, 63.9MB)
//    테스트 10 〉	통과 (12.19ms, 63.1MB)
//    테스트 11 〉	통과 (13.60ms, 64.3MB)
//    테스트 12 〉	통과 (14.00ms, 64.1MB)
//    테스트 13 〉	통과 (8.43ms, 64.2MB)
//    테스트 14 〉	통과 (8.74ms, 63.6MB)
//    테스트 15 〉	통과 (8.60ms, 63.2MB)
//    테스트 16 〉	통과 (8.33ms, 64.6MB)
//    테스트 17 〉	통과 (13.33ms, 63.1MB)
//    테스트 18 〉	통과 (12.78ms, 63.3MB)
//    테스트 19 〉	통과 (8.98ms, 64.2MB)
//    테스트 20 〉	통과 (11.40ms, 64.6MB)
//    테스트 21 〉	통과 (9.89ms, 63.8MB)
//    테스트 22 〉	통과 (9.14ms, 62.2MB)
//    테스트 23 〉	통과 (8.68ms, 62.4MB)


//    3	20	4	10
    
    println(solution(3, 20, 4))

}


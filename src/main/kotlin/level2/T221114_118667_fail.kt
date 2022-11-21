package level1

/**
 * 두 큐 합 같게 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/118667
 *
 */
fun main() {

    // 알고리즘
    // 2개의 배열을 하나의 배열로 만든 다음에.. -> 시간초과 발생
    fun getSolution(arr1: IntArray, arr2: IntArray): Int {
        val arr = arr1 + arr2
        if (arr.sum() % 2 != 0) {
            return -1
        }

        val midValue = arr.sum() / 2
        val arr1LastIdx = arr1.size - 1
        val lastIdx = arr.size - 1
        var sum = arr1.sum()
        var toIdx = arr1.size - 1

        for (i: Int in 0 .. lastIdx) {
            if (i > 0) {
                sum -= arr[i - 1]
            }

            for (m: Int in toIdx .. lastIdx) {
                if (m != toIdx) {
                    sum += arr[m]
                }

                if (sum == midValue) {
                    return i + (m - arr1LastIdx)
                } else if (sum > midValue) {
                    toIdx = m
                    break
                }
            }
        }

        return -1
    }

    fun solution(queue1: IntArray, queue2: IntArray): Int {
        val temp = mutableListOf<Int>()
        temp.add(getSolution(queue1, queue2))
//        println("========= temp1:" + temp.get(0))
        temp.add(getSolution(queue2, queue1))
//        println("========= temp2:" + temp.get(1))
        return temp.filter { it != -1 }
            .minOrNull() ?: -1
    }

    // 로직 개선후
    //    테스트 1 〉	실패 (18.98ms, 63.4MB)
//    테스트 2 〉	통과 (30.73ms, 62.6MB)
//    테스트 3 〉	통과 (18.81ms, 63.9MB)
//    테스트 4 〉	통과 (28.26ms, 63.7MB)
//    테스트 5 〉	통과 (22.16ms, 64.8MB)
//    테스트 6 〉	통과 (18.76ms, 63.1MB)
//    테스트 7 〉	통과 (19.14ms, 63.7MB)
//    테스트 8 〉	통과 (19.80ms, 63.8MB)
//    테스트 9 〉	통과 (20.37ms, 63.9MB)
//    테스트 10 〉	통과 (19.26ms, 64.7MB)
//    테스트 11 〉	통과 (35.40ms, 69MB)
//    테스트 12 〉	통과 (31.09ms, 69.5MB)
//    테스트 13 〉	통과 (28.57ms, 70.7MB)
//    테스트 14 〉	통과 (33.05ms, 73.1MB)
//    테스트 15 〉	통과 (27.88ms, 72.9MB)
//    테스트 16 〉	통과 (26.91ms, 73.1MB)
//    테스트 17 〉	통과 (24.27ms, 77.4MB)
//    테스트 18 〉	통과 (27.88ms, 111MB)
    //    테스트 19 〉	실패 (48.39ms, 110MB)
    //    테스트 20 〉	실패 (41.58ms, 111MB)
//    테스트 21 〉	통과 (33.18ms, 112MB)
//    테스트 22 〉	통과 (50.86ms, 112MB)
    //    테스트 23 〉	실패 (52.19ms, 113MB)
    //    테스트 24 〉	실패 (47.22ms, 113MB)
    //    테스트 25 〉	실패 (28.01ms, 63.5MB)
    //    테스트 26 〉	실패 (19.93ms, 63.4MB)
    //    테스트 27 〉	실패 (25.13ms, 63.2MB)
//    테스트 28 〉	통과 (44.45ms, 77.7MB)
//    테스트 29 〉	통과 (20.31ms, 64.1MB)
//    테스트 30 〉	통과 (33.07ms, 74.3MB)



    // 로직 개선전 - 시간 초과 발생
//    테스트 1 〉	통과 (27.20ms, 62.9MB)
//    테스트 2 〉	통과 (19.95ms, 63.3MB)
//    테스트 3 〉	통과 (20.37ms, 63.1MB)
//    테스트 4 〉	통과 (21.07ms, 64.2MB)
//    테스트 5 〉	통과 (21.77ms, 63.6MB)
//    테스트 6 〉	통과 (25.22ms, 63.7MB)
//    테스트 7 〉	통과 (20.83ms, 64.3MB)
//    테스트 8 〉	통과 (22.67ms, 64.7MB)
//    테스트 9 〉	통과 (45.65ms, 64.1MB)
//    테스트 10 〉	통과 (34.87ms, 62.8MB)
    //    테스트 11 〉	실패 (시간 초과)
//    테스트 12 〉	통과 (662.42ms, 68.6MB)
//    테스트 13 〉	통과 (46.10ms, 72.1MB)
//    테스트 14 〉	통과 (44.27ms, 71.2MB)
//    테스트 15 〉	통과 (390.87ms, 75.5MB)
//    테스트 16 〉	통과 (91.43ms, 77.7MB)
//    테스트 17 〉	통과 (50.81ms, 73.9MB)
//    테스트 18 〉	통과 (143.92ms, 112MB)
    //    테스트 19 〉	실패 (시간 초과)
    //    테스트 20 〉	실패 (시간 초과)
//    테스트 21 〉	통과 (3569.36ms, 111MB)
    //    테스트 22 〉	실패 (시간 초과)
    //    테스트 23 〉	실패 (8017.88ms, 112MB)
    //    테스트 24 〉	실패 (174.07ms, 112MB)
    //    테스트 25 〉	실패 (25.96ms, 63.6MB)
    //    테스트 26 〉	실패 (20.48ms, 63.3MB)
    //    테스트 27 〉	실패 (30.84ms, 62.6MB)
    //    테스트 28 〉	실패 (시간 초과)
//    테스트 29 〉	통과 (24.62ms, 67.9MB)
    //    테스트 30 〉	실패 (시간 초과)

//    queue1        queue2          result
//    [3, 2, 7, 2]  [4, 6, 5, 1]    2
//    [1, 2, 1, 2]  [1, 10, 1, 2]   7
//    [1, 1]        [1, 5]          -1

    println(solution(intArrayOf(3, 2, 7, 2), intArrayOf(4, 6, 5, 1)))
    println(solution(intArrayOf(1, 2, 1, 2), intArrayOf(1, 10, 1, 2)))
    println(solution(intArrayOf(1, 1), intArrayOf(1, 5)))
}
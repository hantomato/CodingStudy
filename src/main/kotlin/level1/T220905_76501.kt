package level1

/**
 * 음양 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 *
 */
fun main() {

    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        return absolutes.zip(signs.asIterable())
            .fold(0) { acc, i ->
                acc + if (i.second) i.first else -i.first
            }
    }

//    테스트 1 〉	통과 (20.02ms, 66.3MB)
//    테스트 2 〉	통과 (20.90ms, 65.4MB)
//    테스트 3 〉	통과 (20.63ms, 66MB)
//    테스트 4 〉	통과 (20.58ms, 65.5MB)
//    테스트 5 〉	통과 (21.62ms, 65.7MB)
//    테스트 6 〉	통과 (21.23ms, 66.3MB)
//    테스트 7 〉	통과 (20.53ms, 66.9MB)
//    테스트 8 〉	통과 (20.18ms, 66.5MB)
//    테스트 9 〉	통과 (27.84ms, 66.5MB)

    fun solutionOne(absolutes: IntArray, signs: BooleanArray) =
        absolutes.foldIndexed(0) { idx, acc, num -> acc + if (signs[idx]) num else -num }

//    테스트 1 〉	통과 (0.08ms, 63.6MB)
//    테스트 2 〉	통과 (0.06ms, 61.1MB)
//    테스트 3 〉	통과 (0.09ms, 63.2MB)
//    테스트 4 〉	통과 (0.09ms, 62.6MB)
//    테스트 5 〉	통과 (0.06ms, 62.9MB)
//    테스트 6 〉	통과 (0.09ms, 61.9MB)
//    테스트 7 〉	통과 (0.06ms, 64.5MB)
//    테스트 8 〉	통과 (0.10ms, 62.8MB)
//    테스트 9 〉	통과 (0.07ms, 63.2MB)

//    [4,7,12]	[true,false,true]	9
//    [1,2,3]	[false,false,true]	0
    
    println(solution(intArrayOf(4,7,12), booleanArrayOf(true,false,true)))
    println(solution(intArrayOf(1,2,3), booleanArrayOf(false,false,true)))

}


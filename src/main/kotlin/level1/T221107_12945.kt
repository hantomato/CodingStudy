package level1

/**
 * 피보나치 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12945
 *
 */
fun main() {

    fun solution(n: Int): Int {

//        fun fibo(a: Int) : Int {
//            return when (a) {
//                0 -> 0
//                1 -> 1
//                else -> fibo(a-1) + fibo(a-2)
//            }
//        }

        fun fibo(a: Int) : Int {
            if (a < 2) {
                return a
            }
            var x1 = 0
            var x2 = 1
            var temp = 1
            for (i in 2 ..a) {

                temp = x1 + x2
                if (temp > 1234567) {
                    temp %= 1234567
                }
                x1 = x2
                x2 = temp
            }
            return temp
        }
        return fibo(n)

//        fun fibo(a: Int) : ULong {
//            if (a < 2) {
//                return a.toULong()
//            }
//            var x1: ULong = 0u
//            var x2: ULong = 1u
//            var temp: ULong = 1u
//            for (i in 2 ..a) {
//
//                temp = x1 + x2
//                x1 = x2
//                x2 = temp
//            }
//            return temp
//        }
//        var mm: ULong = fibo(n)
//        return (fibo(n) % 1234567u).toInt()
    }

//    테스트 1 〉	통과 (0.01ms, 63.3MB)
//    테스트 2 〉	통과 (0.01ms, 62.8MB)
//    테스트 3 〉	통과 (0.01ms, 63.5MB)
//    테스트 4 〉	통과 (0.02ms, 64.2MB)
//    테스트 5 〉	통과 (0.01ms, 63.7MB)
//    테스트 6 〉	통과 (0.01ms, 63.5MB)
//    테스트 7 〉	실패 (0.07ms, 64MB)
//    테스트 8 〉	실패 (0.03ms, 63.3MB)
//    테스트 9 〉	실패 (0.02ms, 63.6MB)
//    테스트 10 〉	실패 (0.04ms, 63.5MB)
//    테스트 11 〉	실패 (0.02ms, 62.5MB)
//    테스트 12 〉	실패 (0.02ms, 64.5MB)
//    테스트 13 〉	실패 (1.19ms, 62.4MB)
//    테스트 14 〉	실패 (1.18ms, 63.3MB)

//    n	return
//    3	2
//    5	5

    println(solution(99999))
    println(solution(0))
    println(solution(1))
    println(solution(2))
    println(solution(3))
    println(solution(4))
    println(solution(5))

}


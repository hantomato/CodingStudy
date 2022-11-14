package level1

/**
 * 최대공약수와 최소공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12940
 *
 */
fun main() {

    fun solution(n: Int, m: Int): IntArray {
        // 최대공약수, 최소공배수 (gcd, lcm)

        // 공약수 구하기
        fun cd(n: Int) = (1 .. n).filter { n % it == 0 }.toIntArray()

        // 최대공약수 구하기 (greatest common divisor)
        fun gcd(a: Int, b: Int) = cd(a).intersect(cd(b).toList().toSet()).last()

        // 최소공배수 구하기 (least common mutltiple)
        fun lcm(a: Int, b: Int) = a * b / (gcd(a, b))

        return intArrayOf(gcd(n,m), lcm(n,m))
    }


//    n	m	return
//    3	12	[3, 12]
//    2	5	[1, 10]
//    4, 10 [2, 20]
//    5 33  [1, 165]
//    6 14  [2, 42]
//    8, 44 [4, 88]



    println(solution(3, 12))
    println(solution(2, 5))

}


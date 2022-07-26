package level1

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */
fun main() {

    // 참고 : https://nugy123.tistory.com/4
    // 10진수를 3진수, 8진수 같은걸로 변환
    fun cvtDecimalToRadix(decimal: Int, radix: Int): List<Int> {
        // 10진수를 x진수로 변환
        // x : 8진수면 8, 2진수면 2, 3진수면 3
        // 3진수 : 45 -> [1,2,0,0]
        // 3진수 : 125 -> [1,1,1,2,2]
        val result = mutableListOf<Int>()
        var temp = decimal
        while (temp >= radix) {
            result.add(temp % radix)
            temp /= radix
        }
        result.add(temp)
        return result.reversed()
    }

    // 3진수, 8진수 같은것을 10진수로 변환
    fun cvtRadixToDecimal(input:IntArray, radix: Int): Int {
        // x 진수를 10진수로 변환
        // x : 8진수면 8, 2진수면 2, 3진수면 3
        var sum = 0
        input.reversed().forEachIndexed { index, i ->
            sum += when (index) {
                0 -> i
                else -> {
                    Math.pow(radix.toDouble(), index.toDouble()).toInt() * i
                }
            }
        }
        return sum
    }

//    3진법
//    1 1
//    2 2
//    3 10
//    4 11
//    5 12
//    6 20
//    7 21
//    8 22
//    9 100
//    10 101
//    11 102
//    12 110

    fun solution(n: Int): Int {
        return n.toString(3)
            .reversed()
            .toInt(3)
    }

    fun solution2(n: Int): Int {
        val temp = cvtDecimalToRadix(n, 3)
            .reversed()
        return cvtRadixToDecimal(temp.toIntArray(), 3)
    }


//    45	7
//    125	229
    println(solution(45))
    println(solution(125))
}


package level1

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */
fun main() {

    /**
     * a       a     1/2=0
     * ab      ab    2/2=1
     * abc     b     3/2=1
     * abcd    bc    4/2=2
     * abcde   c     5/2=2
     * abcdef  cd    6/2=3
     * abcdefg d     7/2=3
     */

    fun solution(s: String): String {
        return if (s.length % 2 == 0) {
            val temp = s.length/2
            s.slice(IntRange(temp-1, temp))
        } else {
            s[s.length/2].toString()
        }
    }

//    "abcde"	"c"
//    "qwer"	"we"

    println(solution("abcde"))
    println(solution("qwer"))


}


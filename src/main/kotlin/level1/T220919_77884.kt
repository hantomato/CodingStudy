package level1

/**
 * 약수의 개수와 덧셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/77884
 *
 */
fun main() {

    fun solution(left: Int, right: Int): Int {
        return (left .. right).fold(0) { acc, c->
            (1 .. c).filter { c % it == 0 }.count()
                .let {
                    if (it % 2 == 1) {
                        acc - c
                    } else acc + c
                }
        }
    }


//    left	right	result
//    13	17	43
//    24	27	52
    println(solution(13, 17))
    println(solution(24, 27))

}


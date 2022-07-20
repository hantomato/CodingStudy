package sample

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * https://school.programmers.co.kr/learn/courses/30/lessons/42748/solution_groups?language=kotlin
 */
fun main() {

// no	new_id	result
// 예1	"...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
// 예2	"z-+.^."	"z--"
// 예3	"=.="	"aaa"
// 예4	"123_.def"	"123_.def"
// 예5	"abcdefghijklmn.p"	"abcdefghijklmn"

    println(solution("...!@BaT#*..y.abcdefghijklm"))

}

fun solution(newId: String) = newId.toLowerCase()
    .filter { it.isLowerCase() || it.isDigit() || it == '-' || it == '_' || it == '.' }
    .replace("[.]*[.]".toRegex(), ".")
    .removePrefix(".").removeSuffix(".")
    .let { if (it.isEmpty()) "a" else it }
    .let { if (it.length > 15) it.substring(0 until 15) else it }.removeSuffix(".")
    .let {
        if (it.length <= 2)
            StringBuilder(it).run {
                while (length < 3) append(it.last())
                toString()
            }
        else it }
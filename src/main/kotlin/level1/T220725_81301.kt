package level1

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/81301
 */
fun main() {

    fun solution(s: String): Int {
        return s.replace("zero", "0")
            .replace("one", "1")
            .replace("two", "2")
            .replace("three", "3")
            .replace("four", "4")
            .replace("five", "5")
            .replace("six", "6")
            .replace("seven", "7")
            .replace("eight", "8")
            .replace("nine", "9")
            .toInt()
    }

//    테스트 1 〉	통과 (8.18ms, 63.9MB)
//    테스트 2 〉	통과 (8.23ms, 64.3MB)
//    테스트 3 〉	통과 (8.07ms, 63.8MB)
//    테스트 4 〉	통과 (7.90ms, 64.6MB)
//    테스트 5 〉	통과 (8.17ms, 64.8MB)
//    테스트 6 〉	통과 (8.58ms, 64.8MB)
//    테스트 7 〉	통과 (8.43ms, 65.1MB)
//    테스트 8 〉	통과 (8.10ms, 64MB)
//    테스트 9 〉	통과 (8.14ms, 64.2MB)
//    테스트 10 〉	통과 (6.71ms, 63.7MB)

    fun solution2(s: String): Int {
        val table = mapOf<String, Int>(
            "zero" to 0,
            "one" to 1,
            "two" to 2,
            "three" to 3,
            "four" to 4,
            "five" to 5,
            "six" to 6,
            "seven" to 7,
            "eight" to 8,
            "nine" to 9
        )

        var result = ""
        var temp = s
        while (temp.isNotEmpty()) {
            if (!temp.first().isLowerCase()) {  // 숫자라면
                result += temp.first()
                temp = temp.substring(1, temp.length)
            } else {
                table.filter { temp.startsWith(it.key) }
                    .firstNotNullOf {
                        temp = temp.substring(it.key.length, temp.length)
                        result += it.value
                    }
            }
        }
        return result.toInt()
    }

//    테스트 1 〉	통과 (11.33ms, 64.1MB)
//    테스트 2 〉	통과 (19.30ms, 66.1MB)
//    테스트 3 〉	통과 (19.30ms, 64MB)
//    테스트 4 〉	통과 (19.51ms, 64.6MB)
//    테스트 5 〉	통과 (19.55ms, 65.8MB)
//    테스트 6 〉	통과 (24.47ms, 64.6MB)
//    테스트 7 〉	통과 (19.36ms, 65.1MB)
//    테스트 8 〉	통과 (19.90ms, 64.1MB)
//    테스트 9 〉	통과 (11.11ms, 64.2MB)
//    테스트 10 〉	통과 (18.79ms, 64.2MB)

//    "one4seveneight"	1478
//    "23four5six7"	234567
//    "2three45sixseven"	234567
//    "123"	123

    println(solution("one4seveneight"))
    println(solution("23four5six7"))
    println(solution("2three45sixseven"))
    println(solution("123"))
}



data class Book(var name: String, var writer: String, var price: Int)

fun main(args: Array<String>) {
    println("Hello World!")



    runFlatMap()
//    runPrime()
//    runList()
//    runString()
//    runString()
//    runMap()
//    runGroupBy()

}

fun runFlatMap() {
    // 333 55555 22
    val ret = listOf(3,5,2).flatMap {
        val emptyList = mutableListOf<Int>()
        for (i in 1 .. it) {
            emptyList.add(it)
        }
        emptyList
    }
    println(ret)
}

fun runPrime() {
    val ret = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter { isPrime(it) }
    println(ret)
}

fun isPrime(number: Int): Boolean {
    for (i in 2..number - 2) {
        if (number % i == 0) {
            return false
        }
    }
    if (number <= 1) return false
    return true
}

fun simpleCvtRadix() {
    println("125 dex -> 3 radix : " + 125.toString(3))    // 125 숫자를 3진수 문자로 변환 : "11122"
    println("11122 (3 radix) -> dex : " + "11122".toInt(3))   // "11122" 3진수 문자를 숫자로 변환 : 125
    println("125 dex -> 8 radix : " + 125.toString(8))    // 125 숫자를 3진수 문자로 변환 : "175"
    println("175 (8 radix) -> dex : " + "175".toInt(8))   // "11122" 3진수 문자를 숫자로 변환 : 125

}

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

fun IntRange() {
    val range1: IntRange = IntRange(1, 3)     // 1..3  포함 (두번째 파라미터명이 endInclusive 이네)
    val range2: IntRange = 1 .. 3       // 1..3  포함(inclusive)
    val range3: IntRange = 1 until 3    // 1..2  미포함
    println(range1)
    println(range2)
    println(range3)
    println("abcde".slice(IntRange(1,3)))            // bcd
    println("abcde".slice(1..3))        // bcd
    println("abcde".slice(1 until 3))   // bc
}

fun subListSliceDiff() {
    // 중요!! slice는 온전히 새로운 리스트를 생성하고
    // subList는 참조를 가지고 있다. 원본값 바뀌면 이 값도 바뀔수 있다.
    // subList는 마지막 인자가 exclusive 인데, slice 는 inclusive 이네
    val myList = mutableListOf(1, 2, 3, 4)
    val subList = myList.subList(1, 3)
    val sliceList = myList.slice(1..2)
    println(subList) // [2, 3]
    println(sliceList) // [2, 3]

    myList[1] = 5
    println(subList) // [5, 3]
    println(sliceList) // [2, 3]
}

fun runList() {
    println(listOf<Int>(1, 3, 5, 7, 9).asReversed())    // [9, 7, 5, 3, 1]
    println(listOf<Int>(1, 3, 5, 7, 9).indexOf(5))      // 2   해당 객체의 인덱스 구하기
    println(listOf<Int>(1, 3, 5, 7, 9, 5).indexOfFirst { it == 5 })     // 2
    println(listOf<Int>(1, 3, 5, 7, 9, 5).indexOfLast { it == 5 })      // 5
    println(listOf<Int>(1, 3, 5, 7, 9, 5).elementAt(3))     // 7    해당 인덱스의 객체 리턴.

    println("===== take, slice")
    println(listOf<Int>(1, 3, 5, 7, 9, 5).take(3)) // 앞의 3개 구하기    [1, 3, 5]
    println(listOf<Int>(1, 3, 5, 7, 9, 5).takeLast(3)) // 뒤에 3개 구하기     [7, 9, 5]
    println(listOf<Int>(1, 3, 5, 7, 9, 5).slice(0 .. 2))    // 앞의 3개 구하기 [1, 3, 5]
    println(listOf<Int>(1, 3, 5, 7, 9, 5).asReversed().slice(0 .. 2).asReversed())    // 뒤의 3개 구하기 [7, 9, 5]

    println("===== plus, minus")
    println(listOf<Int>(1, 3, 5, 7, 9, 5).plus(20)) // 뒤에 붙임 [1, 3, 5, 7, 9, 5, 20]
    println(listOf<Int>(1, 3, 5, 7, 9, 5).minus(5)) // 앞에서부터 탐색해서 일치하는거 하나 제거    // [1, 3, 7, 9, 5]
    println(listOf<Int>(1, 3, 5, 7, 5, 9, 5).minus(listOf(5, 1))) // 일치하는거 모두 제 하네. 차집합    // -> [3, 7, 9]
    println(listOf<Int>(1, 3, 5, 7, 5, 9, 5).minus(listOf(5, 1))) // 일치하는거 모두 제 하네. 차집합    // -> [3, 7, 9]

    println("===== 합집합, 차집합, 교집합")
    val m1 = setOf(1,2,3,4)
    val m2 = setOf(3,4,5,6)
    println(m1.union(m2))       // 합집합 [1, 2, 3, 4, 5, 6]
    println(m1.subtract(m2))    // 차집합 [1, 2] m1 - m2
    println(m1.intersect(m2))   // 교집합 [3, 4]
    val mm1 = listOf(1,2,3,4)
    val mm2 = listOf(3,4,5,6)
    println(mm1.union(mm2))       // 합집합 [1, 2, 3, 4, 5, 6]
    println(mm1.subtract(mm2))    // 차집합 [1, 2] m1 - m2
    println(mm1.intersect(mm2))   // 교집합 [3, 4]

    println("===== reduce, fold")
    println(listOf<Int>(1, 2, 3, 4, 5).reduce { acc, k ->
//        "acc + k" // 에러
        acc + k
    })  // 15
    println(listOf<Int>(1, 2, 3).reduceIndexed() { idx, acc, k ->
//        "acc + k" // 에러
        acc + (idx * k)
    })  // 9
    println(listOf<Int>(1, 2, 3, 4, 5).fold(100) { acc, k ->
        acc + k
    })  // 115
    println(listOf<Int>(1, 2, 3, 4, 5).fold("->") { acc, k ->
        acc + " " + (k*k).toString()
    })  // -> 1 4 9 16 25
    println(listOf<Int>(1, 2, 3, 4, 5).foldIndexed("->") { idx, acc, k ->
        acc + " " + (k*idx).toString()
    })  // -> 0 2 6 12 20
}

fun runString() {
    println("abcdefg".substring(0, 3))                      // abc. 3은 exclusive (미포함)
    println("abcdefg".substring(0 until 3))     // abc until exclusive
    println("hhello".removePrefix("h"))     // 앞에 문자 체크해서 제거
    println("hello".removeSuffix("o"))      // 뒤에 문자 체크해서 제거

    println(listOf<String>("ab", "cd", "ef").joinToString("-")) // "ab-cd-ef"
    println(listOf<String>("ab", "cd", "ef").joinToString("-") {
        it.uppercase()
    }) // "AB-CD-EF"
    println(listOf<String>("ab", "cd", "ef").joinToString("-", limit = 2)) // "ab-cd-..."   // 2개 항목만 취한다.
    println(listOf<String>("ab", "cd", "ef").joinToString("-", "[", "]")) // "[ab-cd-ef]"
    println(listOf<String>("ab", "cd", "ef").indexOfFirst { it == "ef" })

}

fun runMap() {
    val dict = mapOf("zero" to 0, "one" to 1, "two" to 2)
    for ((k, v) in dict) {
        println("key:$k, value:$v")
    }
    dict.forEach {
        println("key:${it.key}, value:${it.value}")
    }
}

fun runGroupBy() {
    println("=============== runGroupBy ================")

    val arr = mutableListOf<Book>()
    arr.add(Book("name1", "writer1", 12000))
    arr.add(Book("name2", "writer2", 21000))
    arr.add(Book("name3", "writer3", 31000))
    arr.add(Book("name4", "writer4", 28000))
    arr.add(Book("name4", "writer5", 23000))

    println("===============1================")
    var arr2: Map<String, List<Book>> = arr.groupBy { it.name }  // 키 - 객체 리스트 로 반환. LinkedHashMap 이네. 삽입 순서 유지
    arr2.forEach { println(it) }

//    name1=[Book(name=name1, writer=writer1, price=12000)]
//    name2=[Book(name=name2, writer=writer2, price=21000)]
//    name3=[Book(name=name3, writer=writer3, price=31000)]
//    name4=[Book(name=name4, writer=writer4, price=28000), Book(name=name4, writer=writer5, price=23000)]

    println("===============2================")
    var arr3: Map<String, List<Int>> = arr.groupBy({ it.name}, { it.price })  // groupBy 에서 value 를 직접 지정함
    arr3.forEach { println(it) }

//    name1=[12000]
//    name2=[21000]
//    name3=[31000]
//    name4=[28000, 23000]

    println("===============3================")
    var arr4 = listOf("One", "two", "Three", "four", "Five")
    val arr6 = arr4.groupingBy { it.first().toUpperCase() }.eachCount()
    arr6.forEach {  // Ma..Entry<Char,Int>
        println("key:${it.key}, value:${it.value}")
    }

//    O=1
//    T=2
//    F=2

//    arr6.run {
//        println("kknd : " + this)
//    }

    println("=== end ====")
}
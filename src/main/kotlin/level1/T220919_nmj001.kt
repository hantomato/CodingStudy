package level1

/**
 * 버블소트 알고리즘 사용해서 소팅하기
 *
 */
fun main() {
//        return arr.sorted().toIntArray()

    fun solution(arr: IntArray): IntArray {
        // 이중 for 문
        // 입력 1~20

        fun swap(src: IntArray, a: Int, b: Int) {
            val temp = arr[a]
            src[a] = src[b]
            src[b] = temp
        }

        // 0 ..  19   last = 18
        var last = arr.size - 2
        for (i in 0 .. arr.size - 2) {
            for (m in 0 .. last) {
                if (arr[m] > arr[m + 1]) {
                    swap(arr, m, m + 1)
                }
            }
            last--
        }
        return arr
    }

    // 입출력 예시
//    11,3,18,4,17,15,14,7,16,20,6,8,19,9,10,12,13,5,2,1
//    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
    println(solution(intArrayOf(11,3,18,4,17,15,14,7,16,20,6,8,19,9,10,12,13,5,2,1)).toList())

}


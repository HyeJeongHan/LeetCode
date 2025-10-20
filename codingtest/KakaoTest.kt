class KakaoTest {
    fun test1(pNumber: Array<String>, pOwner: Array<String>, number: String): String {
        val index = pNumber.indexOf(number)
        return if (index >= 0) {
            pOwner[index]
        } else  {
            number
        }
    }


    fun test2(s: String): Boolean {
        return Regex("^\\d{3}-\\d{3}-\\d{3}$").matches(s)
    }

    fun test3(block: IntArray): Int {
        if (block.size == 2) return 2
        if (block.toSet().size == 1) return block.size

        var longDistance = -1
        block.forEachIndexed { index, i ->
            val distance = getDistance(index, block)
            if (longDistance < distance) {
                longDistance = distance
            }
        }

        return longDistance
    }

    private fun getDistance(currentIndex: Int, block: IntArray): Int {
        var rightIndex = currentIndex
        var leftIndex = currentIndex

        for (i in currentIndex .. block.size) {
            if (i + 1 == block.size) break
            if (block[i] <= block[i + 1]) {
                rightIndex = i + 1
            } else {
                break
            }
        }

        for (i in currentIndex downTo 0) {
            if (i - 1 == -1) break
            if (block[i] <= block[i - 1]) {
                leftIndex = i - 1
            } else {
                break
            }
        }

        return rightIndex - leftIndex + 1
    }

    fun solution(n: Long): IntArray {
        val answer = n.toString()
            .map { it.toString().toInt() }
            .reversed()
            .toIntArray()
        return answer
    }

}

fun main() {
    val a = arrayOf("1", "2", "3")
    val b = arrayOf("a", "b", "c")
    val num = "d"

    val s = KakaoTest()
//    println("test1 >>>>>>> ${s.test1(a, b, num)}")

    val number = "001-501-511"
//    println("test2 >>>>>>> ${s.test2(number)}")

//    val array = intArrayOf(2, 6, 8, 5) // 3
//    val array = intArrayOf(1, 5, 5, 2, 6) // 4
    val array = intArrayOf(1, 1) // 2


//    println("test3 >>>>>>>>>>>>>>>>>>>>>>>>>>>> ${s.test3(array)}")
    println("soultion >>>>>>>>>>>>>>>>>>>>>>>>>>>> ${s.solution(123456)}")
}
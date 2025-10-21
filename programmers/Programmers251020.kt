class Programmers251020 {

    fun solution1(s: String): String {
        val array = s.split(" ")

        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE

        array.forEach {
            val num = it.toInt()
            if (num > max) {
                max = num
            }
            if (num < min) {
                min = num
            }
        }

        return "$min $max"
    }

    fun solution2(s: String): String {
        val array = s.split(" ")
        return array.joinToString(" ") {
            var origin = it.lowercase()
            if (origin.isNotEmpty() && origin.first().isLowerCase()) {
                origin = origin.replaceFirstChar { org -> org.uppercaseChar() }
            }
            origin
        }
    }

    fun solution3(s: String): IntArray {
        var zeroCount = s.count { it == '0' }
        var oneCount = s.count { it == '1' }
        var changeCount = 1

        while (oneCount > 1) {
            val binary = Integer.toBinaryString(oneCount)
            zeroCount += binary.count { it == '0' }
            oneCount = binary.count { it == '1' }

            changeCount++
        }

        var answer = intArrayOf(changeCount, zeroCount)
        print(changeCount)
        println(" $zeroCount")

        return answer
    }
}

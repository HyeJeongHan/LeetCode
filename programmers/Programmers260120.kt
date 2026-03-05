class Programmers260120 {

    fun isPalindrome(x: Int): Boolean {
        return x.toString() == x.toString().reversed()

    }

    fun missingNumber(nums: IntArray): Int {
        var total = 0
        for (i in 0..nums.size) {
            total += i
        }
        return total - nums.sum()

    }

    fun findTheDifference(s: String, t: String): Char {
        if (s.isEmpty()) return t[0]
        var result = t
        s.forEach {
            println(result)
            result = result.replaceFirst(it.toString(), "")
        }

        return result[0]
    }

    fun addStrings(num1: String, num2: String): String {

        val n1 = BigInteger(num1)
        val n2 = BigInteger(num2)
        return (n1 + n2).toString()


    }

    fun ongestCommonPrefix(strs: Array<String>): String {

        var result = ""

        var index = 0

        while (true) {
            var word = ""
            strs.forEach {
                try {
                    if (word.isEmpty()) {
                        word = it[index].toString()
                    } else {
                        if (word != it[index].toString()) {
                            return result
                        }
                    }
                } catch (e: Exception) {
                    return result
                }
            }
            index++
            result += word
        }
    }

    fun birthdayCakeCandles(candles: Array<Int>): Int {
        var result = 0
        var max = -1
        candles.forEach {
            if (it > max) {
                max = it
                result = 1
            } else if (it == max) {
                result++
            }
        }
        return result
    }

    fun solution_1(elements: IntArray): Int {
        val resultSet = elements.toMutableSet()
        var temp = 0
        val size = elements.size

        for (i in 2 .. size) { // 개수
            for (j in 0 until size) {
                temp += elements[j]
                for (k in j + 1 until  j + i) {
                    temp += if (k >= size) {
                        elements[k - size]
                    } else {
                        elements[k]
                    }
                }
                println(temp)
                resultSet.add(temp)
                temp = 0
            }
        }
        return resultSet.size
    }

    fun solution_1(elements: IntArray): Int {
        val resultSet = elements.toMutableSet()
        var temp = 0
        val size = elements.size

        for (i in 2 .. size) { // 개수
            for (j in 0 until size) {
                temp += elements[j]
                for (k in j + 1 until  j + i) {
                    temp += if (k >= size) {
                        elements[k - size]
                    } else {
                        elements[k]
                    }
                }
                println(temp)
                resultSet.add(temp)
                temp = 0
            }
        }
        return resultSet.size
    }

    fun solution_1_2(elements: IntArray): Int {
        val doubled = elements + elements
        val resultSet = mutableSetOf<Int>()
        val size = elements.size

        for (length in 1..size) {
            var sum = doubled.take(length).sum()
            resultSet.add(sum)

            for (start in 1 until size) {
                sum = sum - doubled[start - 1] + doubled[start + length - 1]
                resultSet.add(sum)
            }
        }

        return resultSet.size
    }

}

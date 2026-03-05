class Programmers260120 {
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

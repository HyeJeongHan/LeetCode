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

    fun solution_2(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        // 7 3 /  9 -> 2 1
        // 5  / 10 1 1 /  20 1 -> 1 3 2

        //[93, 30, 55]	[1, 30, 5]	[2, 1]
        //[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]

        val days = mutableListOf<Int>()
        progresses.forEachIndexed { index, i ->
            days.add(ceil(((100 - i).toDouble() / speeds[index])).toInt())
        }

        var max = -1
        var day = 0
        days.forEach { i ->
            if (max == -1) {
                max = i
                day = 1
            } else {
                if (i <= max) { // 대기해야함
                    day++
                } else { // 안해도 됨
                    max = i
                    answer.add(day)
                    day = 1
                }
            }
        }
        answer.add(day)
        return answer.toIntArray()
    }

}

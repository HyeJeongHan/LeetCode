class Solution1 {
    fun plusOne(digits: IntArray): IntArray {
        val reversedDigits = digits.reversed()
        var resultArray = arrayListOf<Int>()
        var isOverTen = true
        reversedDigits.forEachIndexed { index, value ->
            if (isOverTen) {
                val result = value + 1
                isOverTen = false
                if (result >= 10) {
                    resultArray.add(0, 0)
                    isOverTen = true
                } else {
                    resultArray.add(0, result)
                }
            } else {
                resultArray.add(0, value)
            }
        }

        if (isOverTen) {
            resultArray.add(0, 1)
        }

        return resultArray.toIntArray()
    }

}
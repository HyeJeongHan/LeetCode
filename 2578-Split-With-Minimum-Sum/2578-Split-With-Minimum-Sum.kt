class Solution2578 {
    fun splitNum(num: Int): Int {
        val numArray = num.toString().map { it.toString().toInt() }.toMutableList()
        var num1 = ""
        var num2 = ""

        for (i in 0..<numArray.size) {
            val minNum = numArray.min()
            numArray.remove(minNum)

            if (num1.length > num2.length) {
                num2 += minNum
            } else {
                num1 += minNum
            }
        }
        return (if (num1.isEmpty()) 0 else num1.toInt()) + (if (num2.isEmpty()) 0 else num2.toInt())
    }

    // 4325 59
    // 687 75

}
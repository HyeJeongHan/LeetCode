class Solution13 {
    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * Example 1:
     *
     * Input: s = "III"
     * Output: 3
     * Explanation: III = 3.
     * Example 2:
     *
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     * Example 3:
     *
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     *
     * */

    fun romanToInt(s: String): Int {
        var totalCount = 0
        var hashMap = HashMap<String, Int>()
        hashMap.apply {
            put("I", 1)
            put("V", 5)
            put("X", 10)
            put("L", 50)
            put("C", 100)
            put("D", 500)
            put("M", 1000)
        }
        val arr = s.map { it.toString() }
        var prevAmount = 0

        arr.forEach {
            val currentAmount = hashMap[it] ?: 0

            if (prevAmount >= currentAmount) {
                totalCount += currentAmount
            } else if (prevAmount < currentAmount) {
                totalCount = totalCount + currentAmount - prevAmount * 2
            }
            prevAmount = currentAmount
        }

        return totalCount
    }

}

fun main() {
    val s = Solution13()
    s.romanToInt("III")
}
class Solution151 {
    fun reverseWords(s: String): String {
        return s.split(" ")
            .filter { it.isNotBlank() }
            .asReversed()
            .joinToString(separator = " ")
    }

    fun searchInsert(nums: IntArray, target: Int): Int {
        var numSet = nums.toMutableSet()
        numSet.add(target)
        numSet.sorted()
        return numSet.toIntArray().sorted().indexOf(target)
    }
}

fun main() {
    val s = Solution151()
    println("try!! >> ${s.searchInsert(arrayListOf(1,3,5,6).toIntArray(), 2)}")

}
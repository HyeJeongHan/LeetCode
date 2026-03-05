class Solution78 {
    //intArrayOf(0, 1, 2, 3)
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        result.add(listOf())

        for (num in nums) {
            val newSubsets = result.map { it + num }
            println(newSubsets)
            result.addAll(newSubsets)
            println(result)
            println("===================")
        }

        return result
    }
}
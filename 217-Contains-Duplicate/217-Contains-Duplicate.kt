class Solution217 {
    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.size == 1) return false
        return nums.size - nums.toHashSet().size > 0
    }
}
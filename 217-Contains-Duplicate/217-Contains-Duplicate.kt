class Solution217 {
    fun containsDuplicate(nums: IntArray): Boolean {
        return (nums.size - nums.toHashSet().size > 0)
    }
}
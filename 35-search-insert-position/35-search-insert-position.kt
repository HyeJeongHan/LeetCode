class Solution35 {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.contains(target)) {
            return nums.indexOf(target)
        } else {
            var targetIndex = 0
            if (nums.size == 1) {
                return if (nums[0] > target) 0 else 1
            }
            nums.forEachIndexed { index, i ->
                if (index + 1 == nums.size) return nums.size
                if (i < target && nums[index + 1] > target) {
                    return index + 1
                } else if (i > target) {
                    return index
                }
            }
            return targetIndex
        }
    }
}
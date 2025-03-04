class Solution2395 {
    fun findSubarrays(nums: IntArray): Boolean {
        if (nums.size == 2) {
            return false
        }

        var index = 1
        val sumSet = mutableSetOf<Int>()

        while (index < nums.size) {
            val sum = nums[index - 1] + nums[index]
            if (sumSet.contains(sum)) {
                return true
            } else {
                sumSet.add(sum)
            }
            index++
        }
        return false
    }

    // [4,2,4] true
    // [1,2,3,4,5] false
    // [0,0,0] true
}
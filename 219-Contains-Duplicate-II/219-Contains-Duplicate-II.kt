class Solution219 {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        if (nums.size == 1) return false
        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            if (map.containsKey(num)) {
                if (index - (map[num] ?: 0) <= k) {
                    return true
                } else {
                    map[num] = index
                }

            } else {
                map[num] = index
            }
        }
        return false
    }
}
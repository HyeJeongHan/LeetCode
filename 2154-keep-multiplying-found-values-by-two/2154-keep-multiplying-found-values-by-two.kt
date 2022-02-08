class Solution {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        
        var result = original

        while (nums.contains(result)) {
            result *= 2
        }

        return result

    }
}
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { firstIndex, prevNum ->
            for ((secondIndex, nextNum) in nums.withIndex()) {
                if (firstIndex == secondIndex) continue
                if (prevNum + nextNum == target) {
                    return intArrayOf(firstIndex, secondIndex)
                }
            }
        }
    
        return intArrayOf()
    }
    
    // complement 보수 사용 
}
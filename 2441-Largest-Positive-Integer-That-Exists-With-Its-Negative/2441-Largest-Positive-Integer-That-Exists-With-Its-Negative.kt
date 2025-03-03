class Solution2441 {

    fun findMaxK(nums: IntArray): Int {
        if (nums.size == 1) return -1

        val absArray = nums.toSet().map { Math.abs(it) }
        var numSet = mutableSetOf<Int>()
        var answerArray = arrayListOf<Int>()
        absArray.forEach {
            if (numSet.contains(it)) {
                answerArray.add(it)
            } else {
                numSet.add(it)
            }
        }
        return if (answerArray.isEmpty()) -1 else answerArray.max()
    }
    
    // [-1,2,-3,3]
    // [-1,10,6,7,-7,1]
    // [-10,8,6,7,-2,-3]
}
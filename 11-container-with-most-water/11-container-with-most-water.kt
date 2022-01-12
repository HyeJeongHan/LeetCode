class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = (right - left) * min(height[left], height[right])
        while (left < right) {
            if (height[left] <= height[right]) {
                left++
            } else {
                right--
            }
            maxArea = max(maxArea, (right - left) * min(height[left], height[right]))
        }
        return maxArea
    }
    
    private fun min(a: Int, b: Int): Int {
        return if (a < b) {
            a
        } else {
            b
     }
    }

    private fun max(a: Int, b: Int): Int {
        return if (a > b) {
            a
        } else {
            b
        }
    }
}
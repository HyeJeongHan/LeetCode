class Solution {
    fun maxArea(height: IntArray): Int {
        var leftIndex = 0
        var rightIndex = height.size - 1
        var maxArea = rightIndex * min(height[leftIndex], height[rightIndex])

        while (leftIndex < rightIndex) {
            if (height[leftIndex] <= height[rightIndex]) {
                leftIndex++
            } else {
                rightIndex--
            }
            maxArea = max(maxArea, (rightIndex - leftIndex) * min(height[leftIndex], height[rightIndex]))
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
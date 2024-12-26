class Solution2 {
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
            val currentWidth = rightIndex - leftIndex
            val currentMinHeight = min(height[leftIndex], height[rightIndex])
            maxArea = max(maxArea, currentWidth * currentMinHeight)
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
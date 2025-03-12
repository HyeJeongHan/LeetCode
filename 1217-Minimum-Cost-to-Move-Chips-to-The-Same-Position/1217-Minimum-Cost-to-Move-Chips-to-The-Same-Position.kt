class Solution1217 {
    fun minCostToMoveChips(position: IntArray): Int {
        if (position.size == 1) return 0
        var oddCount = 0
        var evenCount = 0
        position.forEach {
            if (it % 2 == 0) {
                evenCount++
            } else {
                oddCount++
            }
        }
        return if (evenCount < oddCount) evenCount else oddCount
    }
}
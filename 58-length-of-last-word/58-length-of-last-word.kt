class Solution58 {
    fun lengthOfLastWord(s: String): Int {
        val trimmedStr = s.trim()
        val stringArrayList = trimmedStr.toCharArray().map { it.toString() }
        if (stringArrayList.size == 1) return 1
        var count = 0
        for (i in stringArrayList.size - 1 downTo 0) {
            if (stringArrayList[i].isNotBlank()) {
                count++
            }

            if (i == 0) break

            if (stringArrayList[i - 1].isBlank()) {
                break
            }
        }
        return count
    }
}
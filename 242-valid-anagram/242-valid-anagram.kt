class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sList = s.split("").filter { it.isNotBlank() }
        val tList = t.split("").filter { it.isNotBlank() }.toMutableList()
        
        if (sList.size != tList.size) return false

        for (sWord in sList) {
            tList.remove(sWord)
        }
        return tList.isEmpty()
    }
}
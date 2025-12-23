class Solution28 {
    fun strStr(haystack: String, needle: String): Int {
        if (!haystack.contains(needle)) return -1
        return haystack.indexOf(needle)
    }
}
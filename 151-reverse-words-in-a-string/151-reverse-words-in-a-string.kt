class Solution {
    fun reverseWords(s: String): String {
        return s.split(" ")
            .filter { it.isNotBlank() }
            .asReversed()
            .joinToString(separator = " ")
    }
}
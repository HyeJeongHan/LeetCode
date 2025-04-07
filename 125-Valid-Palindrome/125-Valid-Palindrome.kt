class Solution125 {
    fun isPalindrome(s: String): Boolean {
        val onlyCharacters = removeSpecialCharacters(s).lowercase()
        return isRealPalindrome(onlyCharacters)
    }

    private fun isRealPalindrome(s: String): Boolean {
        for (i in 0 until s.length / 2) {
            if (s[i] != s[s.length - 1 - i]) {
                return false
            }
        }
        return true
    }

    private fun removeSpecialCharacters(s: String): String {
        return s.filter { it.isLetterOrDigit() }
    }
}

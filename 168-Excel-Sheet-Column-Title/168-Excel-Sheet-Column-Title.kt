class Solution168 {
    fun convertToTitle(columnNumber: Int): String {
        var n = columnNumber
        val sb = StringBuilder()

        while (n > 0) {
            n-- //
            val ch = 'A' + (n % 26)
            sb.append(ch)
            n /= 26
        }

        return sb.reverse().toString()
    }
}

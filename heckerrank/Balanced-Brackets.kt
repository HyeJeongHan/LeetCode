class Balanced-Brackets {
    fun isBalanced(s: String): String {
        val leftBig = '['
        val leftMiddle = '{'
        val leftSmall = '('
        val rightBig = ']'
        val rightMiddle = '}'
        val rightSmall = ')'

        var result = "YES"
        val stack = Stack<Char>()

        s.forEach {
            when (it) {
                leftBig, leftMiddle, leftSmall -> stack.push(it)
                else -> {
                    if (stack.isEmpty()) {
                        result = "NO"
                        return@forEach
                    }
                    val popChar = stack.pop()
                    if ((popChar == leftBig && it == rightBig) ||
                        (popChar == leftMiddle && it == rightMiddle) ||
                        (popChar == leftSmall && it == rightSmall)) {

                    } else {
                        result = "NO"
                        return@forEach
                    }
                }
            }
        }

        return if (stack.isEmpty()) result else "NO"
    }
}
class Programmers251021 {

    // 1 1 1
    // 2 2 11 2
    // 3 3 111 12 21
    // 4 5 1111 112 121 211 22
    //1 2 3 5.. 피보나치 수열이라니..
    fun solution1(n: Int): Long {
        val dp = LongArray(n + 2)
        dp[0] = 0
        dp[1] = 1
        dp[2] = 2

        for (i in 3..n) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567
        }

        return dp[n]
    }


    // 8 4 7 3
    // 12 34 56 78
    // 1  2  3  4
    // 24 57
    // 1  2
    // 47 -> 3
    // 1

    // 8 2 3 2
    // 12 34 56 78
    // 23 67 -> 2

    // 8 1 3 2
    // 12 34 56 78
    // 1 2 3 4
    // 13 67 -> 2

    // 4 1 4 2
    // 12 34
    // 14
    fun solution2(n: Int, a: Int, b: Int): Int {
        var count = 1
        var aPosition = a
        var bPosition = b
        while ((aPosition / 2 + aPosition % 2) != (bPosition / 2 + bPosition % 2)) {
            // 2 == 4

            aPosition = aPosition / 2 + aPosition % 2
            bPosition = bPosition / 2 + bPosition % 2
            count++
        }
        return count
    }


    fun solution3(s: String): Int {
        var count = 0
        var changedStr = s
        repeat(s.length) {
            changedStr = getRotateString(changedStr)
            if (loop(changedStr)) {
                count++
            }
        }
        return count
    }

    private fun getRotateString(s: String): String {
        val first = s.takeLast(1)
        val last = s.dropLast(1)

        return first + last
    }

    private fun loop(s: String): Boolean {
        val leftBig = '['
        val leftMiddle = '{'
        val leftSmall = '('

        val rightBig = ']'
        val rightMiddle = '}'
        val rightSmall = ')'

        val stack = Stack<Char>()

        println(s)

        for (i in s.indices) {
            if (s[i] == leftBig || s[i] == leftMiddle || s[i] == leftSmall) {
                stack.push(s[i])
            } else {
                if (stack.isEmpty()) return false
                val popChar = stack.pop()
                if (popChar == leftBig && s[i] == rightBig || popChar == leftMiddle && s[i] == rightMiddle || popChar == leftSmall && s[i] == rightSmall) {

                } else {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }

}

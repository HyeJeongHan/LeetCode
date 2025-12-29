class Solution17 {
    fun letterCombinations(digits: String): List<String> {
        val map = HashMap<String, ArrayList<String>>()
        map["2"] = arrayListOf("a", "b", "c")
        map["3"] = arrayListOf("d", "e", "f")
        map["4"] = arrayListOf("g", "h", "i")
        map["5"] = arrayListOf("j", "k", "l")
        map["6"] = arrayListOf("m", "n", "o")
        map["7"] = arrayListOf("p", "q", "r", "s")
        map["8"] = arrayListOf("t", "u", "v")
        map["9"] = arrayListOf("w", "x", "y", "z")

        if (digits.length == 1) return map[digits] ?: listOf()

        var result = arrayListOf<String>()
        for (i in 0 until digits.length - 1) {
            result = if (result.isEmpty()) {
                combine(map[digits[i].toString()], map[digits[i + 1].toString()])
            } else {
                combine(result, map[digits[i + 1].toString()])
            }
        }

        return result
    }

    fun combine(aList: ArrayList<String>?, bList: ArrayList<String>?): ArrayList<String> {
        val result = arrayListOf<String>()
        aList?.forEach { a ->
            bList?.forEach { b ->
                result.add("$a$b")
            }
        }
        return result
    }
}

class Sparse-Arrays {
    fun matchingStrings(stringList: Array<String>, queries: Array<String>): Array<Int> {
        val result = mutableListOf<Int>()
        queries.forEach { string ->
            var count = 0
            stringList.forEach { query ->
                if (string == query) {
                    count++
                }
            }
            result.add(count)
        }
        return result.toTypedArray()
    }
}
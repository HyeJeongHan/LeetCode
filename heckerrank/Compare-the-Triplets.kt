class Compare-the-Triplets {
    fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
        if (a.size != b.size) return emptyArray()

        var aResult = 0
        var bResult = 0

        a.forEachIndexed { index, aScore ->
            if (aScore > b[index]) {
                aResult++
            } else if (aScore < b[index]) {
                bResult++
            }
        }
        return arrayOf(aResult, bResult)

    }
}
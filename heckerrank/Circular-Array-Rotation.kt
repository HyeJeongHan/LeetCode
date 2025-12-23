class Circular-Array-Rotation {
    fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
        val remain = k % a.size
        val result = mutableListOf<Int>()

        val firstList = a.take(a.size - remain)
        val secondList = a.drop(a.size - remain)

        val combine = secondList + firstList

        queries.forEach {
            result.add(combine[it])
        }
        return result.toTypedArray()
    }
}
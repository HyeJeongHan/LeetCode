class BinarySearch {
    fun IntArray.binarySearch(value: Int): Int {
        var lowIndex = 0
        var highIndex = this.lastIndex
        var midIndex = 0

        while (lowIndex <=  highIndex) {
            midIndex = (lowIndex + highIndex) / 2

            when {
                this[midIndex] < value -> lowIndex = midIndex + 1
                this[midIndex] > value -> highIndex = midIndex - 1
                this[midIndex] == value -> return midIndex
            }
        }

        return -1
    }
}

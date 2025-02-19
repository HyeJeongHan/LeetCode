class Solution2465 {
    fun distinctAverages(nums: IntArray): Int {
        if (nums.size == 2) return 1

        val list = nums.sorted().toMutableList()
        var avarageSet = mutableSetOf<Float>()

        while (list.isNotEmpty()) {
            var min = list.first()
            var max = list.last()

            println("min >> $min")
            println("max >> $max")
            avarageSet.add((min + max) / 2f)

            list.removeFirst()
            list.removeLast()
        }

        return avarageSet.size

    }

    fun distinctAverages2(nums: IntArray): Int {
        if (nums.size == 2) return 1

        val list = nums.sorted().toMutableList()
        var avarageSet = mutableSetOf<Float>()

        while (list.isNotEmpty()) {
            var min = list[0]
            var max = list[list.size - 1]

            println("min >> $min")
            println("max >> $max")
            avarageSet.add((min + max) / 2f)

            list.removeAt(list.size - 1)
            list.removeAt(0)
        }

        return avarageSet.size

    }
}
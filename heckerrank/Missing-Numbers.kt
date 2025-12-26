class Missing-Numbers {
    fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Array<Int> {
        val result = mutableListOf<Int>()

        val aHashMap = hashMapOf<Int, Int>()
        val bHashMap = hashMapOf<Int, Int>()

        arr.forEach {
            if (aHashMap.contains(it)) {
                aHashMap[it] = (aHashMap[it] ?: 1) + 1
            } else {
                aHashMap[it] = 1
            }
        }
        brr.forEach {
            if (bHashMap.contains(it)) {
                bHashMap[it] = (bHashMap[it] ?: 1) + 1
            } else {
                bHashMap[it] = 1
            }
        }

        bHashMap.forEach { (key, value) ->
            if (!aHashMap.contains(key)) {
                result.add(key)
            } else if (aHashMap[key] != value) {
                result.add(key)
            }

        }
        result.sorted().forEach {
            println(it)
        }

        return result.sorted().toTypedArray()

    }
}
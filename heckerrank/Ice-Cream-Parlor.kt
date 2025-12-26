class Ice-Cream-Parlor {
    fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {
        for (i in 0 until arr.size - 1) {
            for (j in i + 1 until arr.size){
                if (m == arr[i] + arr[j]) {
                    println("i = ${i+1}, j = ${j+1}")
                    return arrayOf(i+1, j+1).sorted().toTypedArray()
                }
            }
        }

        return emptyArray()

    }
}
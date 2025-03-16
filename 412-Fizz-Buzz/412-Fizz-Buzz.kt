class Solution412 {
    // fizz -> 3
    // buzz -> 5
    // fizzbuzz -> 3, 5
    fun fizzBuzz(n: Int): List<String> {
        return arrayListOf<String>().apply {
            for (i in 1 .. n) {
                if (i % 3 == 0 && i % 5 == 0) {
                    add("FizzBuzz")
                } else if (i % 3 == 0) {
                    add("Fizz")
                } else if (i % 5 == 0) {
                    add("Buzz")
                } else {
                    add(i.toString())
                }
            }
        }
    }
}
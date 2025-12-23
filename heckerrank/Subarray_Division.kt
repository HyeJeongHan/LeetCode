import java.math.BigDecimal
import kotlin.collections.forEachIndexed
import kotlin.collections.withIndex
import kotlin.ranges.until

class Subarray_Division {
    fun birthday(s: Array<Int>, d: Int, m: Int): Int {
        var result = 0
        s.forEachIndexed { index, num ->
            var sum = 0
            if (index + m > s.size) return@forEachIndexed
            for (i in 0 until m) {
                sum += s[index + i]
            }

            kotlin.io.println(sum)
            if (sum == d) {
                result++
            }
        }

        return result
    }
}

fun main() {
    val s = Subarray_Division()
    println(s.birthday(arrayOf(1, 2, 1, 3, 2), 3, 2))
    //5
    //1 2 1 3 2
    //3 2
    // return 2

}
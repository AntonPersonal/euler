package euler5

private val RANGE = 20 downTo 1

/**
 * Euler 5.
 * Finds the smallest natural number lower than given [NUMBER] that can be divided by each number in a given [RANGE]
 */
fun main(args : Array<String>) {
    println(findSmallestNumberDivisibleByRange(RANGE))

}

/**
 * Finds the smallest natural number that can be divided by each number in a given [range]
 */
private fun findSmallestNumberDivisibleByRange(  range : IntProgression) : Int {
    // Start at the largest number in the progression
    var i = range.first
    while(true) {
        if (range.all{ divisor -> i % divisor == 0 }) return i;
        // Increase i by the largest number.
        i += range.first;
    }
}
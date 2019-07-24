package euler6

private val RANGE = 1..100

/**
 * Euler 6
 * Calculates the sum square difference of a given [RANGE] of numbers.
 */
fun main (args : Array<String>) {
    println(RANGE.sum() * RANGE.sum() - RANGE.map { i -> i * i }.sum())
}
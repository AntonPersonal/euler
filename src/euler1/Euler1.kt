package euler1

val RANGE = 1..999
val divisors = 3..5

/**
 * Euler 1
 * Function that calculates the sum of all integer numbers below 1000 that are divisible either by 3 or 5.
 */
fun main(args: Array<String>) {
    println(RANGE.filter{ number -> divisors.any { divisor -> number % divisor == 0}}.sum())
}
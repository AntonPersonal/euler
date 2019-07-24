package util

/**
 * Determines the value of the number in the fibonacci sequence at the specified place.
 */
fun calcFibonacci(place: Int): Int {
    if (place < 2) {
        return 1
    }
    return calcFibonacci(place - 1) + calcFibonacci(place - 2)
}
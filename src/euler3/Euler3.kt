package euler3

import util.isPrime

const val NUMBER = 600851475143L


/**
 * Euler 3
 * Calculates the largest prime factor of a given [NUMBER]
 */
fun main(args : Array<String>) {
    var result = NUMBER;
    while (!result.isPrime()) {
        // Keep dividing by the lowest prime number until the result is itself a prime number.
        result /= (1..NUMBER).first({number -> result.rem(number) == 0L && number.isPrime()})
    }
    println(result)
}
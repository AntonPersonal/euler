package euler7

import util.isPrime

const val ST_PRIME_NUMBER = 10001

/**
 * Euler 7.
 * Finds the [ST_PRIME_NUMBER]
 */
fun main (args : Array<String>) {  
    var currentNumber : Long = 1
    // 2 is prime but will be skipped. Start counting at 1.
    var nrOfPrimes = 1


    while (nrOfPrimes != ST_PRIME_NUMBER) {
        // We kan skip all even numbers
        currentNumber += 2
        if (currentNumber.isPrime()) nrOfPrimes++
    }

    println(currentNumber)
}
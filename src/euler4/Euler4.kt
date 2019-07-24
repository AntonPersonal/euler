package euler4

import util.isPalinDrome

/**
 * Euler 4
 * Finds the highest palindromic number that results of the product of two 3-digit numbers
 */
fun main(args : Array<String>) {
    var highestNumber = 1;
    (999 downTo 1).forEach outer@{ i ->
         (i downTo 1).forEach inner@{ j ->
            val sum = i * j

            if (sum < highestNumber) {
                return@inner
            }

            if (sum.isPalinDrome()) {
                highestNumber = sum
            }
        }
    }

    println(highestNumber)
}
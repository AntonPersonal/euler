package euler9

import kotlin.math.sqrt

const val TARGET = 1000

/**
 * Euler 9.
 * Finds the Pythagorean triplet for which holds a + b + c = TARGET
 */
fun main (args : Array<String>) {
    (1..TARGET).forEach outer@{
        a -> (a..TARGET).forEach inner@ {
        b ->
        val c = sqrt((b * b + a * a).toDouble())

        if (a + b + c == TARGET.toDouble()) {
            println("values are: $a, $b, $c")
            println("product: " + a*b*c)
            return@outer
        }
    }
    }
}
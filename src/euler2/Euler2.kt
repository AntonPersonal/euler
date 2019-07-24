package euler2

import util.calcFibonacci

const val LIMIT = 4_000_000

/**
 * Euler 2
 * Finds the sum of all even Fibonacci numbers below 4 million.
 */
fun main(args: Array<String>) {
    val fibonacciNumbers = ArrayList<Int>()
    var i = 0
    while (calcFibonacci(i) < LIMIT) {
        fibonacciNumbers.add(calcFibonacci(i))
        i++
    }
    println(fibonacciNumbers.filter { fibonacciNumber -> condition(fibonacciNumber) }.sum())
}


fun condition(number : Int) = number % 2 == 0;
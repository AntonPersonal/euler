package util

import kotlin.math.floor
import kotlin.math.sqrt

/**
 * Indicates whether the Long is a prime number.
 */
fun Long.isPrime() : Boolean = this > 1 && (2..floor(sqrt(this.toDouble())).toLong()).none { this.rem(it) == 0L }

/**
 * Indicates whether the Long is a palin drome number (i.e. 321123 or 32123)
 */
fun Long.isPalinDrome() : Boolean { return this.toString().equals(this.toString().reversed()) }
fun Int.isPalinDrome()  : Boolean { return this.toString().equals(this.toString().reversed()) }

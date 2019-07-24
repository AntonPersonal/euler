package euler51

import util.isPrime

/**
 * Euler 51: finds the smallest prime which, by replacing part of the number (not necessarily adjacent digits) with the same digit, is part of an eight prime value family.
 */
fun main (args : Array<String>) {

    var i : Long = 56993

    while (true) {

        // we skip even numbers.
        i += 2

        if (!i.isPrime()) {
            continue;
        }


    }
}
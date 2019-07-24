package euler31

/**
 * Euler 31.
 * Calculates in how many ways to add up to 2 pound using all legal British coins
 */
fun main (args : Array<String>) {

    var count = 0

    (0..200).forEach one@{one ->
        (0..100).forEach two@{two ->

            if ((one * 1 + two * 2) % 5 != 0) {
                return@two
            }

            (0..40).forEach five@{five ->

                if ((one * 1 + two * 2 + five * 5) % 10 != 0) {
                    return@five
                }

                (0..20).forEach {ten ->
                    (0..10).forEach {twenty ->
                        (0..4).forEach { fifty ->
                            (0..2).forEach { oneHundred ->
                                (0..1).forEach { twoHundred ->
                                    if (one * 1 + two * 2 + five * 5 + ten * 10 + twenty * 20 + fifty * 50 + oneHundred * 100 + twoHundred * 200 == 200) {
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    println(count.toString() + " possibilities");
}
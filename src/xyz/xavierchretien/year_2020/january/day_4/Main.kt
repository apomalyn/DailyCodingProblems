package xyz.xavierchretien.year_2020.january.day_4

fun main() {
    var term = lookAndSayAt(3)
    print(term)
    println(term == "21")

    term = lookAndSayAt(4)
    print(term)
    println(term == "1211")

    term = lookAndSayAt(5)
    print(term)
    println(term == "111221")
}

/**
 * Determine the nth term of the "look and say" sequence
 *
 * @param n, index of the term we want, must be positive
 * @return the nth "look and say" term
 */
fun lookAndSayAt(n: Int): String {
    if(n < 1) return ""
    else if(n == 1) return "1"
    else if(n == 2) return "11"

    var scanningTerm = "11"

    for (i in 2 until n) {
        var currentTerm = ""

        var currentValue = scanningTerm[0]
        var numberOfCurrentValue = 1
        for (c in scanningTerm.substring(1)) {
            if (c == currentValue)
                numberOfCurrentValue++
            else {
                currentTerm += "$numberOfCurrentValue$currentValue"
                currentValue = c
                numberOfCurrentValue = 1
            }
        }
        currentTerm += "$numberOfCurrentValue$currentValue"
        scanningTerm = currentTerm
    }

    return scanningTerm
}



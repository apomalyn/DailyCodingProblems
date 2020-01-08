package xyz.xavierchretien.year_2020.january.day_3

fun main() {
    println(parseAndCalculation("-1+(2+3)"))
}

/**
 * Parse and calculate the string passed in param
 *
 * @param calculation
 * @return result of the calculation
 */
fun parseAndCalculation(calculation: String): Int {
    var result = 0

    var multiplier = 1
    var subProblem = -1

    for ((index, c) in calculation.withIndex()) {
        if(subProblem == -1 || c != ')')
            when(c) {
                '+' -> multiplier = 1
                '-' -> multiplier = -1
                '(' -> subProblem = index
                ')' -> {
                    result += multiplier * parseAndCalculation(calculation.substring(subProblem + 1, index))
                    subProblem = -1
                }
                else -> result += multiplier * c.toString().toInt()
            }
    }

    return result
}

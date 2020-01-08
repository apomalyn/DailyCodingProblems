package xyz.xavierchretien.year_2020.january.day_2

import java.lang.IllegalArgumentException

fun main() {
    println(findFixedPoint(intArrayOf(-6, 0, 2, 4, 5)))
    println(findFixedPoint(intArrayOf(1, 5, 7, 8)))
}

/**
 * Find each fixed point in a sorted array.
 *
 * @param array, sorted array
 * @return the first fixed point found, null if there is no fixed point.
 */
fun findFixedPoint(array: IntArray): Int? {
    val pointFixedFound = mutableListOf<Int>()

    for ((index, value) in array.withIndex()) {
        if(index == value){
            return index
        } else if (value > index) {
            break
        }
    }
    return null
}

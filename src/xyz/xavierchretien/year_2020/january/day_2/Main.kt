package xyz.xavierchretien.year_2020.january.day_2

import java.lang.IllegalArgumentException

fun main() {
    println(findFixedPoint(intArrayOf(-6, 0, 2, 4, 5)))
    println(findFixedPoint(intArrayOf(1, 5, 7, 8)))
}

/**
 * Find each fixed points in a sorted array.
 *
 * @param array, sorted array
 * @return an list with each fixed points, the list is empty if there is no fixed points.
 */
fun findFixedPoint(array: IntArray): List<Int>{
    if(array[1] < array[0]) throw IllegalArgumentException("Array not sorted")

    val pointFixedFound = mutableListOf<Int>()
    for ((index, value) in array.withIndex()) {
        if(index == value){
            pointFixedFound.add(index)
        }
    }

    return pointFixedFound.toList()
}

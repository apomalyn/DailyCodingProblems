package xyz.xavierchretien.year_2020.january.day_2

fun main() {
    println(findFixedPoint(intArrayOf(-6, 0, 2, 4, 5)))
    println(findFixedPoint(intArrayOf(1, 5, 7, 8)))
}

fun findFixedPoint(array: IntArray): MutableList<Int>?{
    if(array[1] < array[0]) return null

    val pointFixedFound = mutableListOf<Int>()
    for ((index, value) in array.withIndex()) {
        if(index == value){
            pointFixedFound.add(index)
        }
    }

    return if(pointFixedFound.size > 0) pointFixedFound else null
}

package xyz.xavierchretien.year_2020.january.day_6

fun main() {
    println(isUTF8(intArrayOf(1,1,1,0,0,0,1,0, 1,0,0,0,0,0,1,0, 1,0,1,0,1,1,0,0))) //true
    println(isUTF8(intArrayOf(1,1,1,1,0,0,1,0, 1,0,0,0,0,0,1,0, 1,1,1,0,1,1,0,0, 1,0,0,0,0,0,0,1))) //false
    println(isUTF8(intArrayOf(0,1,1,0,0,0,1,0))) //true
    println(isUTF8(intArrayOf(1,1,1,0,0,0,1,0))) //false
}

/**
 * Determine if the array in parameter is a valid UTF-8 encoding
 *
 * @param array contain byte
 * @return if is a valid UTF-8 encoding
 */
fun isUTF8(array: IntArray): Boolean {
    val n = array.size / 8

    if (n == 1) {
        return array.first() == 0
    }

    for (i in 0..n) {
        if (i < n && array[i] != 1)
            return false
        else if (i == n && array[i] != 0)
            return false
    }

    for (i in 1 until n) {
        if (array[i * 8] != 1 || array[i * 8 + 1] != 0)
            return false
    }
    return true
}

package xyz.xavierchretien.year_2020.january.day_5

fun main() {
    println(find("dfkhnsdjfhkjbdfjhasclmojgnbsdc", "12w3"))
    println(find("it's bigger inside", "bigger"))
}

fun find(string: String, pattern: String): Int? {
    for (i in 0 until string.length - pattern.length){
        for ((index, c) in pattern.withIndex()){
            if (string[i + index] != c)
                break
            else if(index == pattern.length - 1)
                return i
        }
    }
    return null
}

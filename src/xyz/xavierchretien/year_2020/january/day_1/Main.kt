package xyz.xavierchretien.year_2020.january.day_1

fun main(args: Array<String>) {
    println(throw_dice(3, 6, 7))
}

fun throw_dice(N: Int, faces: Int, total: Int): Int {
    var subProblems = Array(N+1) { IntArray(total+1) { 0 } }

    var i = 1
    while (i < total && i < faces) {
        subProblems[1][i] = 1
        i++
    }

    for (w in 2..N) {
        for (j in 1..total) {
            for (k in 1..faces) {
                if(k >= j)
                    break
                subProblems[w][j] += subProblems[w - 1][j - k]
            }
        }
    }

    return subProblems[N][total]
}

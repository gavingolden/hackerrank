package hackerrank.algorithms

import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val maxIndex = arr.size - 1
    var diagonalDifference = 0
    for(i in 0..maxIndex) {
        val first = arr[i][i]
        val second = arr[maxIndex - i][i]
        val difference = first - second
        diagonalDifference += difference
    }
    return abs(diagonalDifference)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}



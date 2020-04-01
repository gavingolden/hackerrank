package hackerrank.algorithms

import java.util.*

// Complete the staircase function below.
fun staircase(n: Int): Unit {
  for (level in 1..n) {
    val padding = " ".repeat(n - level)
    val chars = "#".repeat(level)
    val line = padding + chars
    println(line)
  }
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val n = scan.nextLine().trim().toInt()

  staircase(n)
}

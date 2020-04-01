package hackerrank.algorithms

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

typealias Test = (Int) -> Boolean

val isEven: Test = { n -> n > 0 }
val isOdd: Test = { n -> n < 0 }
val isZero: Test = { n -> n == 0 }


// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
  val size = arr.size

  arrayOf(isEven, isOdd, isZero)
    .map { arr.count(it) }
    .map {
      val fraction = it.toDouble() / size.toDouble()
      val roundedFraction = BigDecimal(fraction).setScale(6, RoundingMode.HALF_UP)
      println(roundedFraction)
    }
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val n = scan.nextLine().trim().toInt()

  val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

  plusMinus(arr)
}

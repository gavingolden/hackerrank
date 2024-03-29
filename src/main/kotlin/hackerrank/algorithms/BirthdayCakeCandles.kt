package hackerrank.algorithms

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the birthdayCakeCandles function below.
fun birthdayCakeCandles(ar: Array<Int>): Int {
  var max = -1
  var count = -1
  ar.forEach {
    if (it > max) {
      max = it
      count = 1
    } else if (it == max) {
      count++
    }
  }
  return count
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val arCount = scan.nextLine().trim().toInt()

  val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

  val result = birthdayCakeCandles(ar)

  println(result)
}

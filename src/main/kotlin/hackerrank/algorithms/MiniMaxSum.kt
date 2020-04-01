package hackerrank.algorithms

import java.util.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
  val maxGroupSize = 4

  val minSet = PriorityQueue<Long>(reverseOrder())
  val maxSet = PriorityQueue<Long>()

  arr.forEachIndexed { index, num ->
    if (index < maxGroupSize) {
      minSet.add(num.toLong())
      maxSet.add(num.toLong())
    } else {
      val maxOfMinSet = minSet.first()
      if (num < maxOfMinSet) {
        minSet.remove(maxOfMinSet)
        minSet.add(num.toLong())
      }
      val minOfMaxSet = maxSet.first()
      if (num > minOfMaxSet) {
        maxSet.remove(minOfMaxSet)
        maxSet.add(num.toLong())
      }
    }
  }

  val minSum = minSet.sum()
  val maxSum = maxSet.sum()

  println("$minSum $maxSum")
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

  miniMaxSum(arr)
}

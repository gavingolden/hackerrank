package hackerrank.algorithms

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
  return a.zip(b)
    .map { (a, b) ->
      when {
        a < b -> Pair(0, 1)
        a > b -> Pair(1, 0)
        else -> Pair(0, 0)
      }
    }
    .reduce { cumulativeScores: Pair<Int, Int>, roundScore ->
      Pair(
        cumulativeScores.first + roundScore.first,
        cumulativeScores.second + roundScore.second
      )
    }
    .let { arrayOf(it.first, it.second) }
}

fun main(args: Array<String>) {
  val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

  val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

  val result = compareTriplets(a, b)

  println(result.joinToString(" "))
}

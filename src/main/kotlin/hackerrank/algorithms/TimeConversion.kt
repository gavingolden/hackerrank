package hackerrank.algorithms

import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
  val regex = Regex("(\\d\\d):(\\d\\d):(\\d\\d)(\\w\\w)")
  regex.find(s)?.let {
    val groups = it.groupValues.drop(1)
    val hour = groups[0].toInt()
    val minutes = groups[1]
    val seconds = groups[2]
    val period = groups[3]

    val newHour: Int = when (period) {
      "AM" -> {
        if (hour == 12) 0
        else hour
      }
      "PM" -> {
        if (hour == 12) 12
        else (hour + 12) % 24
      }
      else -> {
        throw RuntimeException("Unknown time period: $period")
      }
    }
    val formattedNewHour = newHour.toString().padStart(2, '0')

    return "$formattedNewHour:$minutes:$seconds"
  } ?: throw RuntimeException("Failed to match input: $s")
}

fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)

  val s = scan.nextLine()

  val result = timeConversion(s)

  println(result)
}

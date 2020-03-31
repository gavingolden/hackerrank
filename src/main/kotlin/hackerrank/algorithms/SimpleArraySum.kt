package hackerrank.algorithms

import hackerrank.util.logger
import org.slf4j.Logger
import java.util.*

class SimpleArraySum

private val logger: Logger = SimpleArraySum().logger()

/*
 * Complete the simpleArraySum function below.
 */
fun simpleArraySum(ar: Array<Int>): Int {
    return ar.reduce {previousSum, currentValue ->
        logger.info("Adding $previousSum and $currentValue")
        previousSum + currentValue
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}


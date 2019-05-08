import java.util.*
import kotlin.math.roundToInt

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {
    val sum = meal_cost + (meal_cost*tip_percent/100) + (meal_cost*tax_percent/100)
    println("${sum.roundToInt()}")

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val meal_cost = scan.nextLine().trim().toDouble()

    val tip_percent = scan.nextLine().trim().toInt()

    val tax_percent = scan.nextLine().trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}
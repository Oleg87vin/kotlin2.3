import java.util.*

fun main() {

    var sum: Int = 0
    val regularUser = true
    val discount = 0.95
    val regulaDiscount = 0.99
    var sumDiscount = 0

    println("Ведите сумма покупки")

    val scan = Scanner(System.`in`)

    sum = scan.nextLine().toInt()

    if ((sum >= 1001) && (sum <= 10_000))
        sum -= 100
    else if (sum > 10_000)
        sum = (sum * discount).toInt()

    if (regularUser) sum = (sum * regulaDiscount).toInt()

    println("сумма к оплате: $sum")
}



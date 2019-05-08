import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextLine().trim().toInt()

    if(N % 2 == 0){
        if(N in 6..20){
            println("Weird")
        }else {
            println("Not Weird")
        }
    }else{
        println("Weird")
    }
}
package ColllegeContest
import java.util.*

fun main(args:Array<String>) {
    val t = readLine()!!.toInt()
    val sc = Scanner(System.`in`)
    val arr = Array<Int>(t) { sc.nextInt() }
    var x1:Int = arr[0]
    arr.forEach{
        x1 = x1 xor it
    }
    var x2:Int = 1
    (1..t+1).forEach { x2 = x2 xor it }
    println(x1 xor x2)
}
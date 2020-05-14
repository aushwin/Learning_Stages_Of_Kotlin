package learn.week1

import java.util.*
import java.math.BigInteger as BigInt

fun main() {
    val n = readLine()!!.toLong()
    var first = BigInt("0")
    var second =BigInt("1")
    var third = if(n==0L) BigInt("0") else first+second
    repeat((1 until n).count()){
        third = first + second
        first = second
        second = third
    }
    print(third % BigInt("10"))
}
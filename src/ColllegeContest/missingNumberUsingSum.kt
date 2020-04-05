package ColllegeContest

import java.util.*

fun main(args:Array<String>){
    val t = readLine()!!.toInt()
    val sc = Scanner(System.`in`)
    val arr = Array<Int>(t){sc.nextInt()}
    var total = (t+1)*(t+2) / 2
    arr.forEach{
        total -= it
    }
    println(total)
}
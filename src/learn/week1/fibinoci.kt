package learn.week1

import java.util.*



fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val arr = LongArray(n.toInt()){0}
    var first:Long = 0
    var second:Long = 1
    var third:Long= if(n==0L) 0 else first + second
    repeat((1 until n).count()) {
        third = first + second
        first =second
        second = third
    }
    print(third)
}
//package Codeforces

import kotlin.system.exitProcess

fun main(args: Array<String>){
    var x = readLine()!!.toInt()
    val builder = StringBuilder()
    var count = 1
    while(x-->0){
        if(count%2==0){
            builder.append("I love ")
            count++
        }
        else{
            builder.append("I hate ")
            count++
        }
        if(x!=0)
            builder.append("that ")
        else {
            builder.append("it")
            println(builder.toString())
            exitProcess(0)
        }
    }
}
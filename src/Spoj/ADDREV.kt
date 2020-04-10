package Spoj
//https://www.spoj.com/problems/ADDREV/
fun main(args:Array<String>){
    var t = readLine()!!.toInt()
    while(t-->0){
        var (a,b) = readLine()!!.split(" ").map{ it.reversed().toInt()}
        println((a+b).toString().reversed().toInt())
    }
}
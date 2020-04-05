import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

//package Codeforces
class Reader (private val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`)) ) {
    private var st: StringTokenizer? =null

    fun next():String {
        while(st==null || !st!!.hasMoreElements()){
            try {
                st = StringTokenizer(br.readLine())
            }catch (e: IOException){
                e.printStackTrace()
            }
        }
        return st!!.nextToken()
    }

    fun nextInt() = next().toInt()
    fun nextLong() = next().toLong()
    fun nextDouble() = next().toDouble()

    fun nextLine(): String{
        var str = ""
        try {
            str = br.readLine()
        }catch (e : IOException){
            e.printStackTrace()
        }
        return str
    }
}
fun main(args : Array<String>){
    val read = Reader()
    var (l , b) = read.nextLine().split(' ').map{it.toInt()}
    var count = 0
    while(l<=b){
        count++
        l*=3
        b*=2
    }
    println(count)
}
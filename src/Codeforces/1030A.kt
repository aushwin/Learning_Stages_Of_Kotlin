package Codeforces
import java.io.*
import java.util.*
import kotlin.system.exitProcess

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
fun main(args: Array<String>){
    val read = Reader()
    val n = readLine()!!.toInt()
    val arr = Array<Int>(n){read.nextInt()}
    arr.forEach {
        if(it == 1){
            println("HARD")
            exitProcess(0)
        }
    }
    println("EASY")
}
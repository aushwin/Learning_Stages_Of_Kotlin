package Tips

import java.io.*
import java.util.*
class Reader (val br: BufferedReader = BufferedReader(InputStreamReader(System.`in`)) ) {
    var st: StringTokenizer? =null

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
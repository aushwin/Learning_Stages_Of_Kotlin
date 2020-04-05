    package ColllegeContest

    import java.util.*
    import kotlin.system.exitProcess

    fun main(args : Array<String>){
        val t = readLine()!!.toInt()
        val sc = Scanner(System.`in`)
        val arr = Array<Int>(t){sc.nextInt()}
        arr.sort()
        val fstELE = arr[0]
        val lstELE = arr[t-1]
        val Arr = (fstELE..lstELE).toList().toTypedArray()
        arr.forEachIndexed { index, i ->
            if (i != Arr[index]) {
                println(Arr[index])
                exitProcess(0)
            }
        }
    }
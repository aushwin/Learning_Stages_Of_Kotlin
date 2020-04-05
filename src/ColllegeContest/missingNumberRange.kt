    package ColllegeContest

    import java.util.*
    import kotlin.system.exitProcess

    fun main(args :Array<String>){
        val sc = Scanner(System.`in`)
        val l = sc.nextInt()
        val r = sc.nextInt()
        val n = sc.nextInt()
        val arr = Array<Int>(n){sc.nextInt()}
        arr.sort()
        val range = (l..r).toList().toTypedArray()
        range.forEach {
            if(arr.binarySearch(it)<0){
                println(it)
                exitProcess(0)
            }
        }

    }
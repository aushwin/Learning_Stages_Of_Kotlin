package ColllegeContest

fun main(args: Array<String>){
    val s = readLine()!!
    var max = 0
    for(i in 0..s.length){
        for(j in i+1..s.length){
            if(s.substring(i,j) == s.substring(i,j).reversed())
                if(max<s.substring(i,j).length)
                 max = s.substring(i,j).length
        }
    }
    println(max)
}
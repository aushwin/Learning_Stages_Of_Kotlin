package ColllegeContest

/*
fun main(args: Array<String>){
    var s = readLine()!!.trim()
    s = s.replace("\\s".toRegex(), "")
    val hashmap = HashMap<Char,Int>()
    s.forEach {
        when(hashmap[it]){
            null -> hashmap[it] = 1
            else -> hashmap[it] = hashmap[it]!! + 1
        }
    }
    val sSet = s.toCharArray().toSet()
    sSet.forEach {
        print("$it${hashmap[it]}")
    }
}*/

fun main(args: Array<String>){
    val s = readLine()!!
    var count=1
    val builder = StringBuilder()
    for(i in 0..s.length-1){
        if(i !=s.length -1&&s[i]==s[i+1]) count++
        else{
            builder.append("${s[i]}${count}")
            count=1
        }
    }
    println(builder.toString())
}


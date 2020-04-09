package Algos

fun findSieve(n:Int): Array<Int> {
    val arr = Array<Int>(n){0}
    println(arr.contentToString()) // fordebugging
    for(i in 3 until n step 2)
        arr[i]=1
    for(i in 0 until n step 2 ){
        if(arr[i]==1){

            for(j in i.times(i) until n)
                arr[j]=0
        }
    }
    println(arr.contentToString()) // fordebugging
    arr[2]==1
    return arr
}


fun main(args:Array<String>){
    val n = readLine()!!.toInt()
    val ar = findSieve(n)
    println(ar.contentToString())
    ar.forEachIndexed{index,it->
        if(it==1)
            print("$index ")
    }
}
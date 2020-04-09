package Algos

import kotlin.math.sqrt

//creating a simple sieve

private fun findSieve(n:Int): MutableList<Int> {
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
    arr[2]=1
    println(arr.contentToString()) // fordebugging
    val ar = mutableListOf<Int>()
    arr.forEachIndexed{index,it->
        if(it==1){
            ar.add(index)
        }
    }
    return ar
}

fun segmentedSieve(n:Int,m:Int){
    println("Segmented sieve called ") // for debugging
    val primes = findSieve(sqrt(m.toDouble()).toInt())
    val fnlArray = Array<Int>(m-n+1){1}
    println(fnlArray.contentToString()) //for debugging
    primes.forEach{
        var con = n / it
        con *=it
        while(con<=m){
            if(con>=n && con!=it){
                fnlArray[con-n] = 0
            }
            con +=it
        }
    }
    println(fnlArray.contentToString()) //for debugging
    for(i in 0 until m-n){
        if(fnlArray[i]==1&&n+i!=1)
            print("${i+n} ")
    }
}


fun main(args:Array<String>){
    val (n,m) = readLine()!!.split(" ").map{ it.toInt()}
    segmentedSieve(n,m)


}
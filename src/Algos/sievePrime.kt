package Algos

import Tips.Reader


fun findSieve(n:Int): Array<Int> {
    val ar = Array<Int>(n){0}
    for (i in 3 until n+1 step 2)
        ar[i] = 1
    var i=3
    var j=0
    while(i<n){
        if(ar[i]==1){
            j=i*i
            while(j<n){
                ar[j]=0
                j+=i;
            }
        }
     i+=2
    }
    ar[0]=0
    ar[1]=0
    ar[2]=1
    return ar
}

fun main(args:Array<String>){
    val sc = Reader()
    println("Enter the limit")
    val n = sc.nextInt()
    val ar = findSieve(n)
    for(i in ar.indices)
        if(ar[i]==1)
        print("$i ")
}
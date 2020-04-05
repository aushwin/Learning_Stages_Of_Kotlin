package Codeforces

fun main(args: Array<String>){
    var (n , k) = readLine()!!.split(' ').map{it.toInt()}
    while(k-->0){
        if(n%10 == 0 ){
            n /=10
        }
        else n-=1
    }
    println(n)
}

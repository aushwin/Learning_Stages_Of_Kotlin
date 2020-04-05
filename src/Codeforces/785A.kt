//package Codeforces

fun main(args:Array<String>){
    val hmap = HashMap<String,Int>(5)
    hmap["Tetrahedron"] = 4
    hmap["Cube"] = 6
    hmap["Octahedron"] = 8
    hmap["Dodecahedron"] = 12
    hmap["Icosahedron"] = 20
    var t = readLine()!!.toInt()
    var sum = 0
    while(t-->0){
        sum += hmap[readLine()!!]!!
    }
    println(sum)

}
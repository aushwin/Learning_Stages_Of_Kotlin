package ColllegeContest

import java.util.*
import kotlin.collections.HashMap

fun main(args : Array<String>){
    val sc = Scanner(System.`in`)
    val st = StringBuilder()
    while(sc.hasNext()) st.append(sc.nextLine())
    var x = st.toString().toCharArray()
    println(x)
    val hmap = HashMap<Char,Long?>(5)
    hmap['c'] = 0
    hmap['o'] = 0
    hmap['v'] = 0
    hmap['i'] = 0
    hmap['d'] = 0
    x.forEach {
        hmap[it] = if(hmap[it]!=null) hmap[it]!! + 1 else null
    }
    println(hmap)
    val fnlmap = hmap.filter { it.value!=null }
    println(fnlmap)
    val lst = fnlmap.values.toList()
    println(lst.minBy{it!!} )

}
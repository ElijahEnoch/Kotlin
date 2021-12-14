package com.example.a20210302

fun main(){
    checkNum(1)

}
//조건식
fun maxBy(a : Int, b : Int) : Int {
    if(a > b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int) : Unit {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }

    var b : Int = when(score){
        1-> 1
        2-> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}


// expression vs statement
// Array n List
//MutableList
fun array() {
    val array : Array<Int> = arrayOf(1,2,3)
    val list :List<Int> = listOf(1,2,3)

    val array2: Array<Any> = arrayOf(1,"d",3,4f)
    val list2 :List<Any> = listOf(1, "d", 11L)

    array[0] = 3
    var result :Int = list.get(0)

    val arrayList :ArrayList<Int> = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)


}
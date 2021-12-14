package com.example.a20210302

fun main(){
forAndWhile()
    forAndWhile2()
    forAndWhile3()
}


fun forAndWhile(){
    val students : ArrayList<String> = arrayListOf("joyce","james","jenny","jennifer")

    for ( name :String in students){
        println("${name}")
    }

    var sum : Int = 0
    for (i :Int in 1..10 step 2) {
        sum += i
    }
    println(sum)
}

fun forAndWhile2(){
    val students : ArrayList<String> = arrayListOf("joyce","james","jenny","jennifer")

    for ( name :String in students){
        println("${name}")
    }

    var sum : Int = 0
    for (i :Int in 10 downTo 1) {
        sum += i
    }
    println(sum)
}

fun forAndWhile3(){
    val students : ArrayList<String> = arrayListOf("joyce","james","jenny","jennifer")

    for ( name :String in students){
        println("${name}")
    }

    for ((index : Int ,name : String ) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for (i :Int in 1..100) sum += i
    println(sum)

    var index = 0
    while (index < 10) {
        println("current index : ${index}")
        index++
    }
}
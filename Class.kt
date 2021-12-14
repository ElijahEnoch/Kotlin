package com.example.a20210302

open class Human(name: String = "Anonymous") {

    constructor(name: String, age : Int) : this(name){
        println("my name is ${name}, ${age}years old")
    }
//init - constructor
    init {
        println("New human has been born!!")
    }
//    open fun mangiare(){
//        println("buonissimo!!")
//    }

    open fun singASong(){
        println("lalala")
    }

}
//kotlin class is final class, so if you like to inherit class, you must made open class
class Korean : Human(){

    override fun singASong() {
        super.singASong()
        println("라라라")
    }

//    override fun mangiare() {
//        super.mangiare()
//        println("buonissimo!!")
//    }
}

fun main() {
//    val human = Human("Elijah")
//
//    var stranger = Human()
//
//    human.mangiare()
//
//    println("his name is ${human.name})"
//    println("his name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()
    //korean.mangiare()

}


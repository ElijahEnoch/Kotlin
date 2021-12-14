package com.example.a20210302
//1.Lamda
//익명함수, value처럼 다룰수있다.
//method의 parameter(매개변수)로 넘겨줄수있다. fun maxBy(a :Int)
//return 값으로 사용할 수가 있다.
val square : (Int) -> (Int) = {number :Int -> number*number}

val nameAge : (String, Int) -> String = {name : String, age : Int ->
    "my name is ${name}, I'm ${age}"
}



fun main() {
    println(square(12))
    println(nameAge("joyce", 99))
    val a = "joyce said"
    val b = "mac said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString(name = "ariana", age = 27))

    println(calculateGrade(97))
    println(calculateGrade(971))

    val lambda :(Double) -> Boolean = {number : Double ->
        number == 4.3213
    }
    println(invokeLambda(lambda))
    println(invokeLambda({it > 3.22}))

    println(invokeLambda{ it > 3.22 })


}


//확장 함수
val pizzaIsGreat: String.() -> String = {
    this + "Pizza is the best!!"
}

fun extendString(name : String, age : Int): String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

// return lambda
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}
// parmeter to lambda
fun invokeLambda(lambda : (Double) -> Boolean) : Boolean {
    return lambda(5.2343)
}



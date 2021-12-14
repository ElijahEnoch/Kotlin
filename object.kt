package com.example.a20210302

object CarFactory {
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main() {
    val car = CarFactory.makeCar( horsePower = 10)
    val car2 = CarFactory.makeCar( horsePower = 200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}
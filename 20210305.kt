package com.example.a20210302

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)

class TicketNormal(val companyName: String, val name: String, var date: String, var seatNumber: Int)

fun main(){
    val ticketA = Ticket(companyName = "koreanAir", name = "joyceHong", date = "20200216", seatNumber = 14)
    val ticketB = TicketNormal(companyName = "koreanAir", name = "joyceHong", date = "20200216", seatNumber = 14)

    println(ticketA)
    println(ticketB)

}
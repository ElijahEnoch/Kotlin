package com.example.a20210302

class Book(val id : Int, val name : String) {

    companion object BookFactory{
          fun getId(): Int {
            return 444
        }

        val myBook = "new book"
        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun  getId() : Int
}
fun main() {
    val book = Book.create()

    val BookId :Int = Book.BookFactory.getId()

    println("${book.id} ${book.name}")
}
package com.example.a20210302


fun main(){
nullCheck()
//ignoreNulls()
}

//fun ignoreNulls(str : String?) {
//    val NotNull : String = str!!
//    val upper :String = NotNull.toUpperCase()
//
//    val email : String?= "joycehongXXXX@nava.vom"
//    email?.let{ it; String
//           println("my email is ${email}")
//    }
//}

//nullable , NonNull
fun nullCheck(){
    var name = "joyce"

    var nullName : String? = null

    var nameInUpperCase : String = name.toUpperCase()
    //대문지 변환

    var nullNameInUpperCase : String? = nullName?.toUpperCase()
    // if nullname isn't null, return toUppercase. but nullname is null, return null

    // ?(elvis Presley function): If you need default

    val lastName : String? = null

    val fullName :String = name+" " + (lastName?: "has NO lastName")

    //!! : express Not Null

    println(fullName)
}



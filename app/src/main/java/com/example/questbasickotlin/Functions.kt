package com.example.questbasickotlin

fun withoutParameter() {
    println("== without Parameter ==")
    println("Hellow, World")
}

fun withParameter(name:String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

//named argument
//named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== with Named Argument ==")
    println("Hello, $name! You are $age years old.")
}
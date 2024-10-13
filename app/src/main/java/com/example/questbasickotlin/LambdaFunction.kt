package com.example.questbasickotlin

// Lambda Functions
// Lambda Functions adalah fungsi yang tidak memiliki nama
// Lambda Functions biasanya digunakan untuk membuat fungsi yang sederhana
// lambda Functions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String {
    return string.uppercase()
}

//Dapat ditulis dalam ekspressi lambda sbb :
fun main() {
    uppercaseString("hello")
    println({ string: String -> string.uppercase() }("hello"))
    //HELLO
}
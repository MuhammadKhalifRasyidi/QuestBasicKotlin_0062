package com.example.questbasickotlin

// List adalah kumpulan data yang disusun secara berurutan dari
// List bersifat prdered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List  Read-Only menggunakan listOf
// List mutable menggunakan metableListOf

fun ContohList() {
    println("=== List ===")
    // List read-only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // List Mutable
    val shape : MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam list mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dalam list mutable
    shape.remove("Triangle")
    println(shape)

    // Mengubah data di dalam list mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

//Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu hanya menyimpan data unique(Tidak boleh ada duplikasi)
//Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
//set bersifat mutable dan read-only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//set read-only menggunakan setOf
//set mutable menggunakan mutableSetOf

fun ContohSet() {
    println()
    println("=== Set ===")

    //Set read-only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //Set Mutable
    val shape : MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //menambahkan data ke dalam Set mutable
    shape.add("Rectangle")
    println(shape)

    //menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    //set read-only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

//Map adalah kumpulan data yang disusun dalam pasangan key-value
//Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
//Map bersifat mutable dan read-only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//Map read-only menggunakan mapOf
//Map mutable menggunakan mutableMapOf

fun ContohMap() {
    println()
    println("=== Map ===")

    //Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    //menambahkan data ke dalam  Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    //menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

    //mengubah data di dalam Map Mutable
    shape["Square"] = 5
    println(shape)

    //Map Read-only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}


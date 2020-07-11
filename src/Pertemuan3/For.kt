package Pertemuan3

fun main() {

    var array = arrayOf("Ucup", "Ucok", "Ucil")

    var total = 9
    for (name in array) {
        println(name)
        total ++
    }

    println("Total Perulangan = $total")


    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray){
        println("Index $i = ${array.get(i)}")
    }
}
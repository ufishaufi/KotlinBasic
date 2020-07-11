package Pertemuan3

fun main() {

    var i = 0

    while (true){
        println("Hello ke-$i")
        i++

        if (i > 10){
            break
        }
    }

    println()

    for (i in 1..10) {
        if (i % 2 == 1){
            continue
        }
        println("Angka $i")
    }
}
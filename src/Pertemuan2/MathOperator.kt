package Pertemuan2

fun main() {
    val result = 10.0 / 3.0
    println(result)

    val result2 = 10 + 10 / 2
    println(result2)

    //Augmented Assignment
    var total: Int = 0

    val barang1 = 100
    total += barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)

    //Unary Operator
    total++// total = total + 1
    println(total)

    total--// total = total + 1
    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)
}
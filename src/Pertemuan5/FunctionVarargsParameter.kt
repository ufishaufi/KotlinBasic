package Pertemuan5

fun countTotal(name: String, vararg value: Int): Int {
    var total = 0
    for (values in value)
        total += values
    return total
}

fun main() {
    //val values = arrayOf(10, 10, 10, 10)
    val result = countTotal("Shaufi",10, 10, 10, 10, 10, 10)
    println(result)

}
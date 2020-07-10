package Pertemuan1

fun main() {

    // Number
    var age: Byte = 10
    var age_new: Int = 200

    println(age)
    println(age_new)

    //Floating point
    var value: Float = 10.10F

    println(value)

    //Literal
    var binary: Int = 0b010101010

    println(binary)

    //Underscore
    var price: Long = 9_000_000_000L

    println(price)

    var priceInt: Int = price.toInt()
    println(priceInt)

    var doubleBinary: Double = binary.toDouble()
    println(doubleBinary)
}

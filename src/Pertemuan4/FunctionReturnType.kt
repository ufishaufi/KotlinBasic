package Pertemuan4

fun add(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun div(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    }else{
        val total = a / b
        return total
    }
}

fun main() {
    println(add(10, 10))
    println(add(100 , 100))

    val result = add(200, 200)
    println(result)

    val result2 = add(5, 5)
    println(result2)

    println(div(100,100))
    println(div(10, 0))
}
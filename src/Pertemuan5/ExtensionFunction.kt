package Pertemuan5

fun String.hello(): String = "hello $this"

fun String.printHello(): Unit = println("hello $this")

fun main() {

    val name = "Shaufi"

    println(name.hello())

    name.printHello()

    "Imanulhaq".printHello()

}
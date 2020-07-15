package Pertemuan5

infix fun String.to(type: String): String{
    if (type == "UP"){
        return this.toUpperCase()
    }else {
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Shaufi Imanulhaq" to "LO"
    println(result)
}
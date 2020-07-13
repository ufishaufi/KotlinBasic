package Pertemuan4

fun hello(firstName: String, lastName: String? = null){
    if (lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Shaufi")
    hello("Udil", "Subakti")
}
package Pertemuan4

fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null){
        println("Hello $firstName")
    }else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Shaufi", null)
    sayHello("Udil", "Subakti")
    sayHello("Ucil", "Tuyul")
}
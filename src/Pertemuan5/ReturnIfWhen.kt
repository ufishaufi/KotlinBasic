package Pertemuan5

fun main() {

    fun sayHello(name: String = ""): String {
        return if (name == ""){
            "Hello Bro!"
        }else{
            "Hello $name"
        }
    }

    fun saysHello(name: String = ""): String {
        return when(name){
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }
    }
    println(sayHello())
    println(sayHello("Shaufi"))

    println(saysHello())
    println(saysHello("Shaufi"))
}
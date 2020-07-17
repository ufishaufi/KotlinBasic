package Pertemuan6

fun toUpper(value: String): String = value.toUpperCase()

fun main() {

    val contohLambda: (String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val sayHello: (String) -> String = {
        "Hello $it"
    }

    val result = contohLambda("Shaufi", "Imanulhaq")
    println(result)

    println(sayHello("Shaufi"))

    val toUpperCase :(String) -> String = :: toUpper
    println(toUpperCase("Shaufi"))
}

package Pertemuan6

fun main() {

    fun hello(name: String, transformer : (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper ={value: String -> value.toUpperCase() }
    println(hello("Shaufi", lambdaUpper))

    println(hello("Shaufi", { value: String -> value.toLowerCase() }))

    val result1 = hello("Shaufi") {value: String ->
        value.toUpperCase()
    }

    val result2 = hello("Shaufi", {value: String -> value.toUpperCase() })
}
package Pertemuan6

fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String):String {
        if (value == ""){
            return "UPS"
        }else{
            return value.toUpperCase()
        }
    }

    println(hello("Shaufi", upper))
    println(hello("", upper))

    println(hello("Imanulhaq", fun(value: String): String{
        return value.toLowerCase()
    }))
}
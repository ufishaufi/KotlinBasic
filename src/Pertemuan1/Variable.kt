package Pertemuan1

fun main() {

    val firstName = "Shaufi"
    val age = 26

    println(firstName)
    println(age)

    // Nullable
    val name: String? = null
    println(name)
    println(name?.length)

    var nama: String? = null
    nama = "Shaufi"
    println(nama)
    println(nama?.length)
}
package Pertemuan2

fun main() {

    val names: Array<String> = arrayOf("Ucup", "Ucil", "Ucok")

    // println(names)
    println(names.size)
    println(names.get(1))
    println(names[0])
    println(names.set(0, "Udil"))

    val nilai: Array<Int> = arrayOf(10, 9, 8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    // Nullable di array
    val nama: Array<String?> = arrayOfNulls(5)
    nama[0] = "Shaufi"
    nama[1] = "Udil"
    nama[2] = null
    nama[3] = "Ucil"
    nama[4] = null
    println(nama.size)
    println(nama[2])

}
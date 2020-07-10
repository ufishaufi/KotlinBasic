package Pertemuan1

fun main() {

    var firstname: String = "Shaufi"
    var lastName : String = "Imanulhaq"

    var address : String = """
        >Jalan belum jadi, RT 01 RW 01,
        >Kabupaten Bandung,
        >Jawa Barat,
        >Indonesia
    """.trimMargin(">")

    println(firstname)
    println(lastName)
    println(address)

    // Mengabungkan String
    var fullname: String = firstname + " " + lastName
    println(fullname)

    var fullname_new: String = "$firstname $lastName"
    println(fullname_new)

    var desc: String = "total $fullname char = ${fullname.length}"
    println(desc)
}
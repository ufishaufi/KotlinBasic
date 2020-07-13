package Pertemuan4

fun fullName(
        firstName: String,
        middleName: String,
        lastName: String
) {
    println("Hello $firstName $middleName $lastName")
}


fun main() {
    fullName("Eko", "Kurniawan", "Khannedy")
    fullName(lastName = "Imanulhaq", firstName = "Muhammad", middleName = "Shaufi")
}
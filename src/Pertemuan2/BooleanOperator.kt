package Pertemuan2

fun main() {

    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiEkstra = 70

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahNilaiEkstra = nilaiEkstra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahNilaiEkstra
    println(apakahLulus)
}
fun finalValue(name: String, vararg values: Int){
    var total = 0.0
    for (value in values){
        total += value
    }
    total /= values.size
    println("Final Value $name = $total")
}

fun hitungTotal(nilai: Array<Int>): Int {
    var jumlah = 0
    for (n in nilai){
        jumlah += n
    }
    return jumlah
}

fun main() {
    val nilai = arrayOf(10,20,30,40)
    val hasil = hitungTotal(nilai)
    println(hasil)

    val values = finalValue("jumlah", 10, 20, 30, 40)
    val values1 = finalValue("jumlah")
}
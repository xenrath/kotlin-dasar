fun main() {
    val members: Array<String> = arrayOf("Eko", "Joko", "Budi")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balance: Array<Int> = arrayOf(10_000, 20_000, 30_000)
//    println(members)
//    println(values)
//    println(balance)

    // Operasi Array
    val eko: String = members[0]
    members.set(2, "Setiawan")
    val joko: String = members.get(2)
//    println(members)
    println(eko)
    println(joko)

    // Array Nullable
//    members[0] = null // Error
//    println(members[0])

    val nama: Array<String?> = arrayOfNulls(5)
    nama[0] = "Sai"
    nama[1] = "La"
    nama[2] = "Mar"
    println(nama[0])
    println(nama[1])
    println(nama.size)
}
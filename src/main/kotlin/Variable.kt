// Variable Constant
const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    val firstName: String = "Saiful Labib"
    var lastName = "Marzuqi Hidayat"

    // Variable Mutable
    lastName = "Xenrath"

    println(firstName)
    println(lastName)

    // Nullable
    var firstName1: String? = "Siti"
//    firstName1 = null

    // error karena firstName1 bisa null
//    println(firstName1.length)
    // cara mengakses yang benar
    println(firstName1?.length)

    // Variable Constant
    println("Welcome to $APP version $VERSION")
}
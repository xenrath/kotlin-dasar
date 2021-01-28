fun double (a: Int): Int = a * 2

fun hi (name: String): Unit = println("Hii $name")

fun main() {
    val result = double(10)
    println(result)
    hi("Labib")
}
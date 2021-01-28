infix fun String.to(type: String): String {
    if (type == "Up"){
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val result: String = "Labib" to "Up"
    val result1: String = "Labib".to("Up")
    println(result)
    println(result1)
    println("Yani" to "Lo")
}
fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(c: Int, d: Int): Int{
    if (d == 0){
        return 0
    } else {
        val result = c / d
        return result
    }
}

fun main() {
    val result = sum(10, 10)
    println(result)

    println(bagi(10, 0))
}
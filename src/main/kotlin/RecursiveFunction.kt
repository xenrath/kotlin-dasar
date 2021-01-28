// Factorial for Loop
fun factorialLoop(value: Int): Int {
    var result = 1;
    for (i in value downTo 1){
        result *= i
    }
    return result
}

// Factorial Recursive Function
fun factorialRecursive(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}

fun main() {
    println(factorialLoop(4))
    println(factorialRecursive(4))
}
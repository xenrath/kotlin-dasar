fun hello(value: String, transformer: (String) -> String) : String {
    return "Hello ${transformer(value)}"
}

fun main() {
    val upperTransformer = { value: String -> value.toUpperCase() }
    val lowerTransformer = { value: String -> value.toLowerCase() }
    println(hello("Siti", upperTransformer))
    println(hello("Yani", lowerTransformer))
    println(hello("Labib", { value: String -> value.toUpperCase() }))

    // Trailing Lambda
    val result = hello("Saiful") { value: String -> value.toUpperCase() }
}
// Inline
inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

// No Inline
inline fun hello1(
    firstName: () -> String,
    noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    // Inline
    println(hello { "Labib" })
    println(hello { "Yani" })
    for(i in 1..10){
        println(hello { "Yani" })
    }

    // No Inline
    println(hello1({ "Saiful"}, { "Labib" }))
}
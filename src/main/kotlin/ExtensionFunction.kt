fun String.hello(): String {
    return "Hello $this"
}

fun String.printHello() = println("Hello $this")

fun main() {
    val name: String = "Labib"
    val hello: String = name.hello()
    println(hello)

    name.printHello()
    "Yani".printHello()
}
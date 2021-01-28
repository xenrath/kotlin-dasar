// return if
fun sayHello(name: String = ""): String {
    return if (name == ""){
        "Hello Bro"
    } else {
        "Hello $name"
    }
}

// return when
fun sayHello1(name:String = ""): String {
    return when(name){
        "" -> "Hello Bro"
        else -> "Hello $name"
    }
}

fun main() {
    println(sayHello())
    println(sayHello("Yani"))
    println(sayHello1("Yani"))
}
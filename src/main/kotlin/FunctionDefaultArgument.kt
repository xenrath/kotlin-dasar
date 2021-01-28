fun hello(firstName: String, lastName: String = "hmm.."){
    println("Halo $firstName $lastName")
}

fun hello1(firstName: String, lastName: String? = null){
    if (lastName == null){
        println("Halo $firstName")
    } else {
        println("Halo $firstName $lastName")
    }
}

fun main() {
    hello("Saiful", "Labib")
    hello("Marzuqi")
    hello1("Hidayat")
}
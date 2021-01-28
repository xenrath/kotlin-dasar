// Method References
fun toUpper (value: String): String = value.toUpperCase()

fun main() {
    // membuat lambda
    val lambdaName: (String) -> String = { value: String ->
        value.toUpperCase()
    }
    // mengeksekusi lambda
    val name = lambdaName("Yani")
    println(name)

    // It - parameternya harus 1 saja
    val lambdaName1: (String) -> String = {
        // it.toUpperCase()
        "Hello $it"
    }
    // mengeksekusi lambda
    val name1 = lambdaName1("Siti")
    println(name1)

    // membuat lambda
    val lambdaName2: (String) -> String = ::toUpper
    // mengeksekusi lambda
    val name2 = lambdaName2("Labib")
    println(name2)
}
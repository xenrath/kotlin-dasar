fun main(){
    fun hello(value: String, transformer: (String) -> String) : String {
        return "Hello ${transformer(value)}"
    }
    val anonymousUpper = fun (value: String): String {
        if (value.isBlank()){
            return "Ups"
        }
        return value.toUpperCase()
    }
    val result = hello("Yani", anonymousUpper)
    println(result)
    println(hello("Labib", anonymousUpper))
    println(hello("Sayang", fun (value: String): String {
        return value.toLowerCase()
    }))
    println(hello("", anonymousUpper))

    // Anonymous Function as Parameter
    val result1 = hello("Saiful", fun(value: String): String {
        if (value.isBlank()){
            return "Ups"
        }
        return value.toUpperCase()
    })
    println(result1)
}
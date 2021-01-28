fun main() {
    var i = 0
    while (i < 10){
        println("Perulangan $i")
        i++
    }
    println("Selesai Perulangan")

    // Example
    for (i in 1..7) {
        println("Perulangan $i")
        while (i == 3){
            println("Hai..")
            break
        }
    }
}
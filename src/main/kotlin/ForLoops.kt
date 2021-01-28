fun main() {

    // For Array
    val names = arrayOf("Labib", "Marzuqi", "Hidayat")
    var total = 0
    for (name in names){
        println(name)
        total++
    }
    println("Total perulangan = $total")

    // For Range
    for (value in 0..100 step 2){
        println(value)
    }
    for (value1 in 100 downTo 0 step 5){
        println(value1)
    }

    val ukuranArray = names.size -1
    for (i in 0..ukuranArray){
        println("Index $i = ${names.get(i)}")
    }
}
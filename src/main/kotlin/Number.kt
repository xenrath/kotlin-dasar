fun main() {

    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L
    println(age)
    println(height)
    println(distance)
    println(balance)

    // floating point number
    var value: Float = 98.98F
    var radius: Double = 2342342343.54535
    println(value)
    println(radius)

    // literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b001101
    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)

    // underscore in number
    var price: Long = 10_000_000_000L
    println(price)

    var priceInt: Int = price.toInt()
    println(priceInt) // overflow

    var doubleBinary: Double = binaryLiteral.toDouble()
    println(doubleBinary)
}
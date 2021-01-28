fun main() {
    // Range
    val range = 1..100
    println(range)

    // Range Terbalik
    val range1 = 100 downTo 1 step 2
    println(range1)

    // Operasi Range
    println(range.count())
    println(range.contains(40))
    println(range.contains(101))
    println(range.first)
    println(range.last)
    println(range.step)

    println(range1.count())
    println(range1.contains(40))
    println(range1.contains(101))
    println(range1.first)
    println(range1.last)
    println(range1.step)
}
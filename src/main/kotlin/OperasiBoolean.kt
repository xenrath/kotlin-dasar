import kotlin.math.abs

fun main() {

    // Operasi Boolean
    val finalExam = 80
    val attendant = 90
    val absent = 70

    val passFinalExam = finalExam > 75
    val passAttendant = attendant > 80
    val passAbsent = absent > 75

    val pass = passFinalExam && passAttendant && passAbsent
    println(pass)
}
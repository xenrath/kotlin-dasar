fun main() {

    // When Expression
    val finalExam = 'A'
    when (finalExam){
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Ups")
    }

    // When Expression Multiple Option
    val finalExam1 = 'B'
    when (finalExam1){
        'A', 'B', 'C' -> println("Lulus")
        else -> {
            println("Tidak Lulus")
        }
    }

    // When Expression In
    val finalExam2 = 'A'
    val passValue = arrayOf('A', 'B', 'C')
    when (finalExam2){
        in passValue -> println("Pass")
        !in passValue -> println("Try Again")
    }

    // When Expression Is
    val name = "xen"
    when (name){
        is String -> println("This is String")
        !is String -> println("This is Not String")
    }

    // When tanda Variable
    val examValue = 90
    when {
        examValue > 80 -> println("Good Job")
        examValue > 60 -> println("Not Bad")
        else -> println("Try Again Next Year")
    }
}
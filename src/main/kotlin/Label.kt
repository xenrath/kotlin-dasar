// Break to Label
fun labelBreak(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (i > 5){
                break@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}

// Continue to Label
fun labelContinue(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (j == 5){
                continue@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}

// Return to Label
fun labelReturn(){

}
fun test(name: String, param: (String) -> Unit): Unit = param(name)

fun main() {
    test("Labib") testLabel@{
        if (it == "Yani"){
            return@testLabel
        } else {
            println("Siti")
        }
    }
}
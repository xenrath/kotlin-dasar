fun fullName(firstName: String, middleName: String, lastName: String){
    println("Hello $firstName $middleName $lastName")
}

fun main(){
    fullName("Saiful", "Labib", "Marzuqi")
    fullName(firstName = "Saiful", lastName = "Marzuqi", middleName = "Labib")
}
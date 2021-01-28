fun main() {
    var firstName: String = "Saiful Labib"
    var lastName: String = "Marzuqi Hidayat"
    var fullName: String = "Saiful Labib Marzuqi Hidayat"
    var address: String = """
        Street Not Yet Done,
        Province Subang,
        Country Indonesia
    """
    println(firstName)
    println(lastName)
    println(fullName)
    println(address)

    // String Trim Margin
    var address1: String = """
        |Street Not Yet Done,
        |Province Subang,
        |Country Indonesia
    """.trimMargin()
    var address2: String = """
        >Street Not Yet Done,
        >Province Subang,
        >Country Indonesia
    """.trimMargin(">")
    println(address1)
    println(address2)

    // Menggabungkan String
    var fullName1: String = firstName + " " + lastName
    println(fullName1)

    // String Template
    var fullName2: String = "$firstName $lastName"
    var desc: String = "Nama $fullName2 mempunyai ${fullName2.length} huruf"
    println(fullName2)
    println(desc)

}
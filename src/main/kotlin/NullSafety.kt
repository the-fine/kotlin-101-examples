fun main(args: Array<String>) {
    val simplePoko = SimplePoko(firstName = "safe", lastName = "last", email = "some@email.com", gender = null)
    simplePoko.gender?.let {
        println("gender is $it")
    }
    val gender = simplePoko.gender ?: "no gender"
    val s: String = simplePoko.gender //compilation error
    println("gender: $gender")
    getPoko()?.let { println("null safe first name: ${it.firstName}") }
}

fun getPoko(isNull: Boolean = false) : SimplePoko? {
    if (!isNull) {
        return SimplePoko(firstName = "safe", lastName = "last", email = "some@email.com", gender = "some gender")
    }
    return null
}
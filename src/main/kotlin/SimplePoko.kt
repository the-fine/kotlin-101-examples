data class SimplePoko(val firstName: String,
                      val lastName: String = "no name",
                      val email: String,
                      val gender: String?)

fun main(args: Array<String>) {
    val simplePoko = SimplePoko(email = "kotlin@bizzabo.com", firstName = "Kotlin", gender = "droid")
    val copy = simplePoko.copy(firstName = "Kotlin Copy")
    val simplePoko2 = SimplePoko(email = "alex@bizzabo.com", firstName = "Alex", lastName = "Fainshtein", gender = "male")
    println(arrayOf(simplePoko,simplePoko2).map { it -> it.email})
    simplePoko.also{ println("first name ${it.firstName}") }
    println("first name 1 ${simplePoko.firstName}, first name 2 ${simplePoko2.firstName}")
}
fun main(args: Array<String>) {
    val daniel = SimplePoko(firstName = "Daniel", lastName = "Ben Tov", email = "daniel@bizzabo.com", gender = "male")
    val royi = SimplePoko(firstName = "Royi", lastName = "Schwartz", email = "royi@bizzabo.com", gender = "male")
    val droid = SimplePoko(firstName = "Droid", lastName = "kotlin", email = "kotlin@bizzabo.com", gender = "droid")
    arrayOf(daniel, royi, droid).forEach { println("first name: ${it.firstName}, last name: ${it.lastName}, email: ${it.email}") }
}
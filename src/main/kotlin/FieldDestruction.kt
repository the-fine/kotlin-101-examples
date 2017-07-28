fun main(args: Array<String>) {
    val droid = SimplePoko(firstName = "Droid", lastName = "kotlin", email = "kotlin@bizzabo.com", gender = "droid")
    val (firstName, lastName, email, gender) = droid
    println("first $firstName, last $lastName, email $email")
}
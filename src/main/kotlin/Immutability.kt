class Immutable(val price: Int, var note: String)

fun main(args: Array<String>) {
    val immutable = Immutable(price = 10, note = "some note")
    immutable.note = "changed note"
    immutable.price = 15 //compilation error
    immutable = Immutable(price = 20, note = "some other note") //compilation error

}
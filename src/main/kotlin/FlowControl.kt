fun main(args: Array<String>) {
    val range = when(5) {
        in 1..3 -> "between 1 and 3"
        in 4..6 -> "between 4 and 5"
        else -> "bigger then 5"
    }
    println(range)
    val res = if (number in arrayOf(1,2,7,3,123)) {
        "some strange case"
    } else {
        "other range"
    }
    println(res)
}
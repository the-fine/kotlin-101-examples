fun main(args: Array<String>) {
    val num : Number = 1
    val ret = when(num) {
        is Int -> num.toFloat()
        is Float -> num.isFinite()
        else -> num.toString()
    }

    if (num is Number) {
        num.toFloat()
    }
}
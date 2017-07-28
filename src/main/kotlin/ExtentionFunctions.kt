fun String.underScoreToCamelCase() : String {
    return split("_").map { it.substring(0,1).toUpperCase() + it.substring(1).toLowerCase() }.joinToString("")
}

fun main(args: Array<String>) {
    println("SOME_UNDER_SCORE".underScoreToCamelCase())
}
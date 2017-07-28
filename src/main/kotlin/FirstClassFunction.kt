var plus = {x: Int, y: Int -> x + y}
var minus = {x: Int, y: Int -> x + y}
enum class Arithmetic {plus,minus}
var arithmeticFunc = { x: Int, y: Int, func: (Int,Int) -> Int -> func(x,y)}

fun main(args: Array<String>) {
    when(Arithmetic.plus) {
        Arithmetic.plus -> arithmeticFunc(1,2,plus)
        Arithmetic.minus -> arithmeticFunc(1,2,minus)
    }
}
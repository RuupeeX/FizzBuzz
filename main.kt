fun main() {

    for (index in 1..100) {
        val divisiblePorTres = index % 3 == 0
        val divisiblePorCinco = index % 5 == 0
        if (divisiblePorTres && divisiblePorTres) {
            println("fizzbuzz")
        } else if (divisiblePorTres) {
            println("fizz")
        } else if (divisiblePorCinco) {
            println("buzz")
        } else {
            println(index)
        }
    }
}
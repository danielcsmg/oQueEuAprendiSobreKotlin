fun main() {
    val x = 2

    println("Oi, $x oioioioi")
    println("oi $x")

    println("A soma é ${soma(1, 4)}")
    println("A divisão é ${divisao(1.0, 0.0)}")
}

fun soma(a: Int, b: Int) = a + b

fun divisao(a: Double, b: Double) = if(b != 0.0) a/b else 0

fun nome(): Int{
    return 1
}
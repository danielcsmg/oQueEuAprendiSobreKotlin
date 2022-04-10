class Retangulo (
    private val altura: Int,
    private val largura: Int
    )
{

    //Primeira forma de se fazer uma função
    fun area(): Int{
        val areaRec = largura * altura
        return areaRec
    }

    //Segunda forma de se fazer uma função
    fun perimetro() = 2 * (altura + largura)

    //Terceira forma de se fazer uma função
    val isQuadrado
        get() = largura == altura
}

fun main() {
    val retangulo = Retangulo(3, 3)

    println(retangulo.isQuadrado)

    println(retangulo.area())

    println(retangulo.perimetro())
}
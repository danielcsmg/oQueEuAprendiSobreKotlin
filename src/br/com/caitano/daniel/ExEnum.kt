package br.com.caitano.daniel

enum class ExEnum(val altura: Int, val largura: Int) {
    QUADRADO(10, 10),
    RETANGULO(15, 40);

    fun area() = altura * largura


}
fun figura(geo: ExEnum): String{
    return when(geo){
        ExEnum.QUADRADO -> "quadrado"
        ExEnum.RETANGULO -> "retângulo"
    }
}
fun main() {
    println(ExEnum.QUADRADO.altura)
    println(ExEnum.QUADRADO.largura)
    println(ExEnum.QUADRADO.area())
    println(ExEnum.RETANGULO.altura)
    println(ExEnum.RETANGULO.largura)
    println(ExEnum.RETANGULO.area())

    val exemplo = figura(ExEnum.RETANGULO)

    println(exemplo)
}
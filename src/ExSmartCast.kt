import kotlin.reflect.typeOf

interface Pessoas
class Nome(val nome: String): Pessoas
class Casal(val primeiraPessoa: Pessoas, val segundaPessoa: Pessoas) : Pessoas

fun avaliacao(pessoas: Pessoas): String =
//    Primeira forma de fazer
//    if(pessoas is Nome){
//        return  "${pessoas.nome} é uma pessoa"
//    }
//
//    if (pessoas is Casal){
//        return "${avaliacao(pessoas.primeiraPessoa)} e ${avaliacao(pessoas.segundaPessoa)} são um casal"
//    }

//    Segunda forma de fazer
    when (pessoas){
        is Nome -> {
            println("Oi")
            pessoas.nome
        }
        is Casal -> {
            "${avaliacao(pessoas.primeiraPessoa)} e ${avaliacao(pessoas.segundaPessoa)}"
        }
        else -> throw java.lang.IllegalArgumentException("Algo errado aconteceu")
    }

fun main() {

    val pessoas = avaliacao(Casal(Nome("José"), Nome("Roseli")))

    val pessoas2 = avaliacao(Casal(Casal(Nome("José"), Nome("Roseli")), Nome("Pedro")))


    println(pessoas)

    val num: String? = null


    var nome2: String? = null


    if (!(nome2 == null && false)){
        println("oi $nome2")
    }

    while(pessoas == "" || false){

    }

    val tamanho = nome2?.length ?: "Daniel"

    println("$tamanho")
    nome2 = readln()

    when {
        nome2 == null -> println("oi")
        nome2 == "Daniel" -> println("Olá")
        else -> println("Dddd")
    }
}
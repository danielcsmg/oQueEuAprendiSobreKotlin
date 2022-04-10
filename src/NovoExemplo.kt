import br.com.caitano.danielA.Pessoa

fun main() {
    val pessoa1 = Pessoa("Daniel", 27, "Superior", true)
    val pessoa2 = Pessoa("João", 2, "Não tem", false)

    println("Pessoa: ${pessoa1.nome}, ${pessoa1.idade}, ${pessoa1.escolaridade}")
    println("Pessoa: ${pessoa2.nome}, ${pessoa2.idade}, ${pessoa2.escolaridade}")
    println("${1 + 1}")
    while (true) {
        val opcao = readln().toBoolean()
        pessoa1.comer(opcao)
        println(pessoa1.acao)
    }

}
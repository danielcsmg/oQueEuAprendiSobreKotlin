package br.com.caitano.danielA

class Pessoa(
    val nome: String,
    val idade: Int,
    val escolaridade: String,
    var acao: Boolean
)
{
    private fun fazerComida(acao: Boolean = true): Boolean{
        this.acao = acao
        if (acao) println("$nome fazendo comida") else println("$nome não pode fazer comida agora.")
        return acao
    }

    fun comer(acao: Boolean){
        var comidaPronta = fazerComida(acao)
        if(comidaPronta) println("$nome comendo") else println("$nome Não pode comer")
    }
}

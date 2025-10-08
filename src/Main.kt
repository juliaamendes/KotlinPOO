
class Pessoa(val nome: String, val idade: Int) {

    fun apresentar() {
        println("Nome: $nome, Idade: $idade")
    }
}

fun main() {

    val pessoa1 = Pessoa("Ana", 25)
    val pessoa2 = Pessoa("Bruno", 30)
    val pessoa3 = Pessoa("Carla", 22)

    println("Dados da Pessoa 1:")
    pessoa1.apresentar()

    println("\nDados da Pessoa 2:")
    pessoa2.apresentar()

    println("\nDados da Pessoa 3:")
    pessoa3.apresentar()
}


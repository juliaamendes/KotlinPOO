class Produto(val nome: String, val preco: Double)


class Carrinho {
    private val produtos = mutableListOf<Produto>()

    fun adicionarProduto(produto: Produto) {
        produtos.add(produto)
        println("Produto '${produto.nome}' adicionado ao carrinho.")
    }

    fun mostrarCarrinho() {
        if (produtos.isEmpty()) {
            println("O carrinho está vazio.")
        } else {
            println("Produtos no carrinho:")
            for ((index, produto) in produtos.withIndex()) {
                println("${index + 1}. ${produto.nome} - R$ ${"%.2f".format(produto.preco)}")
            }
        }
    }

    fun calcularTotal(): Double {
        return produtos.sumOf { it.preco }
    }
}

fun main() {
    val produto1 = Produto("Camisa", 59.90)
    val produto2 = Produto("Tênis", 199.99)
    val produto3 = Produto("Boné", 39.90)

    val carrinho = Carrinho()


    carrinho.adicionarProduto(produto1)
    carrinho.adicionarProduto(produto2)
    carrinho.adicionarProduto(produto3)

    println("\n--- Carrinho ---")
    carrinho.mostrarCarrinho()

    val total = carrinho.calcularTotal()
    println("\nTotal da compra: R$ ${"%.2f".format(total)}")
}

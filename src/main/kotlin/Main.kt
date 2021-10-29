fun main(args: Array<String>) {
    val opcoes = mutableListOf("Alfredo", "Rogério", "Ana")

    while (true) {
        println("Digite sim para ver as opções, e quando quiser parar, digite não: ")
        val simNao = readLine()!!

        if (simNao != "sim") {
            break
        }

        println(
            "Digite 1 para adicionar um convidado," +
                    " 2 para saber como remover um convidado" +
                    ", ou 3 para ver a lista de convidados: "
        )
        var escolha = readLine()!!

        when (escolha) {
            "1" -> {
                println("\nDigite o nome da pessoa: ")
                var nome = readLine()!!

                opcoes.add(nome).toString()

                println("\nA versão mais atualizada da lista de convidados $opcoes\n")
            }
            "2" -> {
                println("Remova uma pessoa da lista: ")
                var nome = readLine()!!

                if (opcoes.contains(nome)) {
                    opcoes.remove(nome)
                    println("$nome foi removido (a)\n")
                } else {
                    println("$nome não existe na lista\n")
                }
            }
            "3" -> {println("\n$opcoes\n") }
        }
    }
}
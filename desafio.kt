// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String, val matricula: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    // matricula um usuário na formação
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário: ${usuario.nome}, matriculado em $nome.")
    }

    // Exibe informações
    fun exibeInformacoes() {
        println("Formação: $nome - Nível: $nivel")
        println("Conteúdos:")
        conteudos.forEach { conteudo ->
            println("${conteudo.nome} - Duração: ${conteudo.duracao} minutos")
        }
        println("Inscritos:")
        inscritos.forEach { inscrito ->
            println("Nome: ${inscrito.nome} - matricula: ${inscrito.matricula}")
        }
    }
}

fun main() {
    
    val conteudo1 = ConteudoEducacional("Curso Kotlin", 60)
    val conteudo2 = ConteudoEducacional("POO em Kotlin", 120)

    val formacao = Formacao("Curso Kotlin", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2))

    val usuario1 = Usuario("Bruno Moreira", 123)
    val usuario2 = Usuario("Henrique", 1234)

    // Testando as matrícula
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Chamando função para exibir as informações
    formacao.exibeInformacoes()
}

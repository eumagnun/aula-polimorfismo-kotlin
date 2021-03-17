fun main(args: Array<String>) {
    val sistema = Sistema()

    println()
    println("Dados do professor")
    println("==================")
    val professor: Professor = Professor()
    professor.calcularSalario()
    professor.getDisciplina()
    sistema.abrirSistema(professor)

    println()
    println("Dados do diretor")
    println("================")
    val diretor: Diretor = Diretor()
    diretor.calcularSalario()
    sistema.abrirSistema(diretor)


    println()
    println("Dados do aluno")
    println("==============")
    val aluno: Aluno = Aluno()
    aluno.caldularMedia()
    sistema.abrirSistema(aluno)


}

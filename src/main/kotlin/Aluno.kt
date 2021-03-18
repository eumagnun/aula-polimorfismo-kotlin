class Aluno : Logavel {

    fun caldularMedia() {
        println("Média do aluno: "+9.8)
    }

    override fun efeatuarCadastro() {
        val sistema = Sistema();
        sistema.cadastrarNoBanco()
    }

}
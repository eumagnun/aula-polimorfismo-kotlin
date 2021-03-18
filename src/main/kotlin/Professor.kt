
class Professor : Funcionario(),Logavel {

    fun getDisciplina(){
        println("Disciplina Android")
    }

    override fun efeatuarCadastro() {
        val sistema = Sistema();
        sistema.cadastrarNoBanco()
    }

}
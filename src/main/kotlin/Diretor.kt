
class Diretor : Funcionario(),Logavel {
    private val desconto:Double=35.0
    private val bonus:Double=80.0
    
    override fun calcularSalario() {
        println("Salario Padrão: "+(salarioPadrao-desconto+bonus) )
    }

    override fun efeatuarCadastro() {
        val sistema = Sistema();
        sistema.cadastrarNoBanco()
    }

}

abstract class Funcionario {
    val salarioPadrao:Double=1000.0
    
    open fun calcularSalario() {
        println("Salario Padrão: "+salarioPadrao )
    }
 }
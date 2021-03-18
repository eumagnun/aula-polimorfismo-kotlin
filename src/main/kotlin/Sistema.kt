
class Sistema(){
    fun abrirSistema(logavel: Logavel){
        println("Entrando no sistema...")
        logavel.efetuarLogin()
    }


    fun cadastrarNoBanco(){
        println("cadastrado no banco com sucesso!")
    }
}
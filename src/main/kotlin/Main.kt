import Funcionario
import SalesRepn
import SalesManager

fun main(args: Array<String>) {

    val fabricio: Funcionario = Funcionario("Fabricio", "Calvanese",
        123, 20, 30,)

    val rodrigo: Funcionario = Funcionario("Rodrigo", "Albuquerque",
        542, 60.0, 3)

    Funcionario.registration(fabricio)

}








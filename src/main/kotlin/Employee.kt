import kotlin.math.min

abstract class Funcionario(
    val nome: String, val sobrenome: String, registro: Int, idade: Int, var diasTrabalhados: Int,
    var diasFerias: Int, var salario: Double, var anosTrabalhados: Int
) {

    fun tempoAteAposentar(): Int {
        return min(60 - idade , 40 - anosTrabalhados)
    }

    fun tempoRestanteDeFerias(): Int {
        return (diasTrabalhados / 360) * (30 - diasFerias)

    }

    fun calcularBonus(): Double {
        return 2.2 * salario
    }

}
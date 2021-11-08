class SalesRepn (nome: String, sobreNome: String,
                 registro: Int,
                 idade: Int, diasTrabalhados: Int, diasFerias: Int,
                 salario: Double, anosTrabalhados: Int, var vendas: Int
) :


    Funcionario(nome, sobreNome, registro, idade, diasTrabalhados, diasFerias, salario, anosTrabalhados){

        fun calculateComission(): Double {
            return 0.1 * vendas
        }
}




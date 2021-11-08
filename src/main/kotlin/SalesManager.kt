class SalesManager(nome: String, sobreNome: String, registro: Int,
                   idade: Int, diasTrabalhados: Int, diasFerias: Int,
                   salario: Double, anosTrabalhados: Int, var vendas: Int, sobrenome: String) :


    Funcionario(nome, sobreNome, registro, idade, diasTrabalhados, diasFerias, salario, anosTrabalhados)
{

        val equipeVendas = hashMapOf<Int, SalesRepn>()

        fun addRepVendas(salesRepn: SalesRepn){

            equipeVendas.put(salesRepn.registro, salesRepn)
        }


        fun calculoDeComissao(){
            var numVendas = 0.0
            if (equipeVendas.isEmpty()){
                println("Não representantes de vendas na equipe")
            }else{
                for (item in equipeVendas){
                    numVendas += item.value.vendas
                }
                val comissao = 0.03 * numVendas

                println("Acomissão geral, com base nas vendas realizadas pela equipe" +
                        "é R$$comissao")
            }
        }

} 

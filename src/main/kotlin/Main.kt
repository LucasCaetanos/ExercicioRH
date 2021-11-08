fun main(args: Array<String>) {

    val pedro = SalesRepn("Pedro","Antonio",1234,24,15,30,
    2900.00,8,700)

    val carlos = SalesRepn("Pedro","Antonio",1234,24,15,30,
        2900.00,8,700)

    val jose = SalesRepn("Pedro","Antonio",1234,24,15,30,
        2900.00,8,700)

    val luiz = SalesManager("Pedro","Antonio",1234,24,15,30,
        2900.00,8,700)

    println("***Informações de Pedro")
    println(pedro.tempoAteAposentar())
    println(pedro.tempoRestanteDeFerias())
    println(pedro.calcularBonus())
    println(pedro.calculateComission())
    println("--------------")

    


}








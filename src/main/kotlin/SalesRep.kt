open class SalesRepn (firstName: String = "", lastName: String = "",
                      registration: Int = 0,
                      age: Int = 60, daysWorked: Int = 360, vacationDaysTaken: Int = 30,
                      salary: Double = 2000.0, yearsWorked: Int = 40, var salesMade: Double):


    Funcionario("Josinei", "da Silva", 12,){

    var employeeSales = arrayListOf(salesMade)
    fun calculateComission(): Double {
        var comission = 0.1 * salesMade
        return(comission)
    }

    override fun calculateBonus(): Double {
        return super.calculateBonus()
    }
}
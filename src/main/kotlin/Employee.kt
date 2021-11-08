package com.generation

import kotlin.math.min

open class Funcionario (var firstName: String = "", var lastName: String = "", var registration: Int = 0,
                        var age: Int = 60, var daysWorked: Double = 0.0, var vacationDaysTaken: Int = 30,
                        var salary: Double = 2000.0, var yearsWorked: Int = 40){

    fun timeToRetirement(): Int {
        var variavelTempo = min(60 - age, 40 - yearsWorked)
        return(variavelTempo)
    }

    fun vacationTimeLeft(): Int {
        var tempoRestanteViajem = (daysWorked / 360)(30 - vacationDaysTaken)
        return(tempoRestanteViajem)
    }

    open fun calculateBonus(): Double {
        var bonus = 2.2 * salary
                return (bonus)
    }

}
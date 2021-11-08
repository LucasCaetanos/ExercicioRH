package com.generation

abstract class SalesManager {

    interface Funcionario {

        var firstName: String
        var lastName: String
        var salary: Double

        fun calculateBonus()


        fun showCalculateBonus(){
            println("Seu salário é este: ${calculateBonus()}")
        }
    }
} 

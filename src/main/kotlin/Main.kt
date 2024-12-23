package org.guivic

fun main() {


    println("Calculator test")
    println("===============")

    do {
        print("Introduce the operation (ENTER to exit): ")
        val input = readln()

        if (input != "") {
            print("Introduce the first number: ")
            val value1 = readln().toDouble()
            print("Introduce the second number: ")
            val value2 = readln().toDouble()

            val calculator = ScientificCalculator(value1, value2)

            when (input) {
                "sum" -> calculator.sum()
                "substract" -> calculator.subtract()
                "multiply" -> calculator.multiply()
                "divide" -> calculator.divide()
                "square" -> calculator.square()
                "root" -> calculator.squareRoot()
                else -> println("Invalid operation")
            }
            calculator.printResult()
        } else

            println("Thanks for using the program")

    } while (input != "")

}

package org.guivic

open class Calculator(val value1: Double, val value2: Double) {

    var result = 0.0

    fun sum() {
        result = value1 + value2
    }

    fun subtract() {
        result = value1 - value2
    }

    fun multiply() {
        result = value1 * value2
    }

    fun divide() {
        if (value2 != 0.0) {
            result = value1 / value2
        } else {
            println("You cannot divide by zero")
        }
    }

    fun printResult() {
        println("Result: $result")
    }

}
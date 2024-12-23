package org.guivic

class ScientificCalculator(value1: Double, value2: Double):
Calculator(value1, value2) {
    fun square() {
        result = value1 * value1
    }

    fun squareRoot() {
        result = Math.sqrt(value1)
    }
}
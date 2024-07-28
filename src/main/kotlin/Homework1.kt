package org.example

class Homework1 {
    fun calculate() {
        println("1부터 9까지의 숫자를 입력하세요:")
        val n = readlnOrNull()
        val input = Integer.parseInt(n)

        println("$input 단 :")
        for (i: Int in 1..9) {
            println("\n $input * $i = ${input * i}")
        }
    }
}
package org.example

fun main() {
    println("1부터 9까지의 숫자를 입력하세요:")
    val n = readlnOrNull()
    val input = Integer.parseInt(n)
    println("$input 단 :")
    println(Homework1().multiplicationTable(input))
}

class Homework1 {
    fun multiplicationTable(inputNum: Int): ArrayList<Int> {
        val result = ArrayList<Int>()

        for (i: Int in 1..9) {
            result.add(inputNum * i)
        }
        return result
    }
}

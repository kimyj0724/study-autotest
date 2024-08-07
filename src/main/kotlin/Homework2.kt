package org.example

fun main() {
    println(Homework2().solution("-1 0 1 2"))
}

class Homework2 {
    fun solution(s: String): String {
        val strArr = s.split(" ")
        val numArr = ArrayList<Int>()

        try {
            strArr.indices.forEach {
                // indices : Collection 타입이 갖는 속성으로 IntRange 타입 반환
                numArr.add(strArr[it].toInt())
            }
        } catch (e: Exception) {
            return "올바르지 않은 Input 입니다."
        }

        return "${numArr.minOrNull()} ${numArr.maxOrNull()}"
    }
}
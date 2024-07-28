package org.example

class Homework2 {
    fun solution(s: String): String {
        val strArr = s.split(" ")
        val numArr = ArrayList<Int>()

        strArr.indices.forEach {
            // indices : Collection 타입이 갖는 속성으로 IntRange 타입 반환
            numArr.add(strArr[it].toInt())
        }
        return "${numArr.minOrNull()} ${numArr.maxOrNull()}"
    }
}
package org.example

class Homework2 {
    fun solution(s: String): String {
        val strArr = s.split(" ")
        val numArr = ArrayList<Int>()

        strArr.indices.forEach {
            numArr.add(strArr[it].toInt())
        }
        return "${numArr.minOrNull()} ${numArr.maxOrNull()}"
    }
}
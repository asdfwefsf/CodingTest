package com.company.kodingtest

fun main() {
//    var inputNum = readLine()!!.toString().toInt()
//    var resultNum : Int = 0
//    var endGiJoon : Boolean = true
//    var answer : Int = 0
//    while (endGiJoon) {
//        resultNum = inputNum * (inputNum - 1)
//        inputNum = inputNum - 2
//
//        if(inputNum == 1) {
//            endGiJoon = false
//            answer = resultNum.toString().contains("0").
//        }
//    }
//    return answer
    var inputNum = readLine()!!.toInt()
    // 2 , 5 -> 1개
    // 2 , 2 , 5 -> 1개
    // 2 , 5 , 5 -> 1개
    // 2 , 2 , 5 , 5 -> 2개
    // 2 , 2 , 2 , 5 -> 1개
    // 따라서 inputNum의 5의 갯수가 중요해 즉 , 5의 갯수가 답이야.
    var result : Int = 0
    while( inputNum >= 5) {
        result += inputNum / 5
        inputNum /= 5
    }
    println(result)
}
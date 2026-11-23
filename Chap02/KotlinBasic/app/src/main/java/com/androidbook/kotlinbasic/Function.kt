package com.androidbook.kotlinbasic

import android.util.Log

fun functionExample() {
    var num1 = 3
    var num2 = 5
    var result = mul(num1, num2)
    Log.d("코틀린 : 사용자 정의 함수 ", "$num1 * $num2  =  $result")
}

fun mul(a: Int, b: Int): Int {
    var number = a * b
    return number
}

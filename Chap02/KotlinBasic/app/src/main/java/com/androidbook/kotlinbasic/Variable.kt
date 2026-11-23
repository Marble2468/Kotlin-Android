package com.androidbook.kotlinbasic

import android.util.Log

fun variableExample() {
    var myAge = 20
    myAge = 25
    Log.d("코틀린 : 가변 변수 var", "나의 나이는 " + myAge)
}

fun dataTypeExample() {
    var numOne = 1
    var numTwo = 3000000000
    var myByte: Byte = 1
    var myInt: Int = 20
    var myLong = 25L

    Log.d("코틀린 : 정수 자료형 ", "Int : " + numOne)
    Log.d("코틀린 : 정수 자료형 ", "Long : " + numTwo)
    Log.d("코틀린 : 정수 자료형 ", "Byte : " + myByte)
    Log.d("코틀린 : 정수 자료형 ", "Int : " + myInt)
    Log.d("코틀린 : 정수 자료형 ", "Long : " + myLong)
}

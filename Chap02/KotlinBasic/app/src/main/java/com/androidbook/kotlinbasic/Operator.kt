package com.androidbook.kotlinbasic

import android.util.Log

fun operatorExample() {
    var x: Int = 4
    var y: Int = 2

    Log.d("코틀린 : 산술 연산자 ", "x + y = " + (x + y))
    Log.d("코틀린 : 산술 연산자 ", "x - y = " + (x - y))
    Log.d("코틀린 : 산술 연산자 ", "x / y = " + (x / y))
    Log.d("코틀린 : 산술 연산자 ", "x * y = " + (x * y))
    Log.d("코틀린 : 산술 연산자 ", "x % y = " + (x % y))
}

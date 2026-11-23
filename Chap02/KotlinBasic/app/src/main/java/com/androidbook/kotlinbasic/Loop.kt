package com.androidbook.kotlinbasic

import android.util.Log

fun loopExample() {
    for (i in 1..5) {
        Log.d("코틀린 : for 반복문 ", "반복 변수" + i)
    }
}

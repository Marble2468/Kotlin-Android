package com.androidbook.kotlinbasic

import android.util.Log

fun ifExample() {
    var num: Int = 3
    if (num > 0) {
        Log.d("코틀린 : if 조건문 ", "숫자 " + num + "은 양수")
    }
}

fun whenExample() {
    var day: Int = 2
    var result: String
    when (day) {
        1 -> result = "Monday"
        2 -> result = "Tuesday"
        3 -> result = "Wednesday"
        4 -> result = "Thursday"
        5 -> result = "Friday"
        6 -> result = "Saturday"
        7 -> result = "Sunday"
        else -> result = "Invalid day"
    }
    Log.d("코틀린 : when 조건문 ", result)
}

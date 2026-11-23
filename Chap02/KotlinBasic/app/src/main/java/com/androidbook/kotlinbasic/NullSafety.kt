package com.androidbook.kotlinbasic

import android.util.Log

fun nullSafetyExample() {
    var nonNullName: String = "John"
    Log.d("코틀린 : 널 처리", "Non-nullable : $nonNullName")

    var nullableName: String? = "John"
    Log.d("코틀린 : 널 처리", "Nullable : $nullableName")
    nullableName = null
    Log.d("코틀린 : 널 처리", "Nullable : $nullableName")

    val name1: String? = "John"
    val length1 = name1?.length
    Log.d("코틀린 : 널 처리", "?. 연산자 : $length1")

    val name2: String? = null
    val length2 = name2?.length
    Log.d("코틀린 : 널 처리", "?. 연산자 : $length2")

    val name3: String? = null
    val length3 = name3?.length ?: 0
    Log.d("코틀린 : 널 처리", "?: 연산자 : $length3")

    val name4: String? = null
    try {
        val length4 = name4!!.length
        Log.d("코틀린 : 널 처리", "!! 연산자 : $length4")
    } catch (e: NullPointerException) {
        Log.d("코틀린 : 널 처리", "!! 연산자 : NullPointerException 발생")
    }

    val name5: String? = "John"
    name5?.let {
        Log.d("코틀린 : 널 처리", "이름의 길이는 ${it.length}입니다.")
    }
}

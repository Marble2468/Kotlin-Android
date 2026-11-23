package com.androidbook.kotlinbasic

import android.util.Log

fun scopeFunctionExample() {
    val name: String? = "Kotlin"
    name?.let {
        Log.d("코틀린 : 스코프 함수 let", "이름의 길이는 ${it.length}입니다.")
    }

    val hello: String? = "Hello, Kotlin"
    val messageLength = hello?.run {
        Log.d("코틀린 : 스코프 함수 run", "이름은 $this 입니다.")
        length
    }
    Log.d("코틀린 : 스코프 함수 run", "길이: $messageLength")

    val result = with(StringBuilder()) {
        append("Hello, ")
        append("Kotlin!")
        toString()
    }
    Log.d("코틀린 : 스코프 함수 with", result)

    val member = Member().apply {
        this.name = "John"
        age = 25
    }
    Log.d("코틀린 : 스코프 함수 apply", member.name)

    val number = mutableListOf(1, 2, 3).also {
        Log.d("코틀린 : 스코프 함수 also", "리스트의 크기: ${it.size}")
        it.add(4)
    }
    Log.d("코틀린 : 스코프 함수 also", "$number")
}

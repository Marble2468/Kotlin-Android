package com.androidbook.kotlinbasic

import android.util.Log

open class Animal {
    open fun sound(): String {
        return "동물이 소리를 낸다"
    }
}

class Dog : Animal() {
    override fun sound(): String {
        return "멍멍"
    }
}

interface Animal2 {
    fun sound(): String
    fun sleep(): String {
        return "잠을 잔다"
    }
}

class Dog2 : Animal2 {
    override fun sound(): String {
        return "멍멍"
    }
}

abstract class Animal3 {
    abstract fun sound(): String
}

class Dog3 : Animal3() {
    override fun sound(): String {
        return "멍멍"
    }
}

open class Animal4 {
    open val name: String = "동물"

    open fun sound(): String {
        return "동물 소리"
    }

    constructor() {
        Log.d("코틀린 : 객체 지향 프로그래밍", "Animal4 생성자 호출")
    }
}

class Dog4 : Animal4 {
    override val name: String = "강아지"

    override fun sound(): String {
        return "멍멍!"
    }

    fun printNames() {
        Log.d("코틀린 : 객체 지향 프로그래밍", "this.name = ${this.name}")
        Log.d("코틀린 : 객체 지향 프로그래밍", "super.name = ${super.name}")
    }

    fun callSoundMethods() {
        Log.d("코틀린 : 객체 지향 프로그래밍", "this.sound() 호출 결과: ${this.sound()}")
        Log.d("코틀린 : 객체 지향 프로그래밍", "super.sound() 호출 결과: ${super.sound()}")
    }

    constructor() : super() {
        Log.d("코틀린 : 객체 지향 프로그래밍", "Dog 생성자 호출")
    }
}


package com.androidbook.kotlinbasic

import android.util.Log

fun classExample() {
    var myObj = Member()
    myObj.name = "홍길동"
    myObj.age = 20
    myObj.gender = 'M'
    myObj.printMemberInfo()
}

fun constructorExample() {
    var myEmp = Employee(202201, "홍길순")
    var myPerson = Person("홍길순", 20)
}

fun inheritanceExample() {
    val myAnimal = Animal()
    val myDog = Dog()

    Log.d("코틀린 : 객체 지향 프로그래밍 ", "Animal 클래스: ${myAnimal.sound()}")
    Log.d("코틀린 : 객체 지향 프로그래밍 ", "Dog 클래스: ${myDog.sound()}")
}

fun interfaceExample() {
    val myDog = Dog2()

    Log.d("코틀린 : 객체 지향 프로그래밍 ", "Dog 클래스: ${myDog.sound()}")
    Log.d("코틀린 : 객체 지향 프로그래밍 ", "Dog 클래스: ${myDog.sleep()}")
}

fun abstractClassExample() {
    val myDog = Dog3()

    Log.d("코틀린 : 객체 지향 프로그래밍 ", "Dog 클래스: ${myDog.sound()}")
}

fun superThisExample() {
    val myDog = Dog4()

    myDog.printNames()
    myDog.callSoundMethods()
}

package com.androidbook.kotlinbasic

import android.util.Log

fun collectionExample() {
    val lists = listOf("월요일", "화요일", "수요일", "목요일", "금요일")
    val sets = setOf(1, 2, 2, 3, 3, 3, "Java", "Java", "Kotlin")
    val maps = mapOf(1 to "Java", 2 to "Kotlin", 3 to "Android")

    Log.d("코틀린 : 컬렉션", "불변 리스트: $lists")
    Log.d("코틀린 : 컬렉션", "첫 번째 요일: ${lists[0]}")

    Log.d("코틀린 : 컬렉션", "불변 셋: $sets")
    Log.d("코틀린 : 컬렉션", "셋에 'Java' 포함 여부: ${"Java" in sets}")

    Log.d("코틀린 : 컬렉션", "불변 맵: $maps")
    Log.d("코틀린 : 컬렉션", "맵에서 key 2에 해당하는 값: ${maps[2]}")
}

fun mutableCollectionExample() {
    val lists = mutableListOf("월요일", "화요일", "수요일", "목요일", "금요일")
    val sets = mutableSetOf(6, 10)
    val maps = mutableMapOf(1 to "Java", 2 to "Kotlin", 3 to "Android")

    Log.d("코틀린 : 컬렉션", "초기 리스트: $lists")
    Log.d("코틀린 : 컬렉션", "초기 셋: $sets")
    Log.d("코틀린 : 컬렉션", "초기 맵: $maps")

    lists[0] = "일요일"
    lists.add("토요일")

    sets.add(2)
    sets.add(5)

    maps[1] = "C#"
    maps[4] = "C++"

    Log.d("코틀린 : 컬렉션", "변경 후 ------------------------------")
    Log.d("코틀린 : 컬렉션", "변경된 리스트: $lists")
    Log.d("코틀린 : 컬렉션", "변경된 셋: $sets")
    Log.d("코틀린 : 컬렉션", "변경된 맵: $maps")
}

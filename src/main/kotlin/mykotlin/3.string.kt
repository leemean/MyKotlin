package main.mykotlin

val str1:String = "world"
val str2:String = "kotlin"
val a:Int = 67
val b:Int = 68

fun printStr() = println("hello $str1")

fun printStr2() = println("hello ${ if(a > b) str1 else str2 }")
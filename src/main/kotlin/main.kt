package main

import main.mykotlin.*

fun main(args:Array<String>){

    //fun
    println(max(34,43))

    //string
    printStr()
    printStr2()

    //class properties
    val rect = Rectangle(50,50)
    println(rect.isSquare)

    //enum
    printColorRgb()

    //when
    println(getMnemonic(Color.YELLOW))
}
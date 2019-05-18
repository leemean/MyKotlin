package main

import main.mykotlin.*

fun main() {

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

    //while for
    //printfizzBuzz()
    printArrayList()

    //exception
    //testException()

    //collection
    printCollectionJavaClass()

    //tostring
    printToString()

    //extension fun
    printExtensionFun()
    printExtensionToStringFun()

    //extension property
    printExtensionProperty()

    testImplements()
}
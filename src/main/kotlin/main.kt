package main

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

import main.mykotlin.*
import kotlin.system.measureTimeMillis

import main.mycoroutine.*

//fun main() {
//
//    //fun
//    println(max(34,43))
//
//    //string
//    printStr()
//    printStr2()
//
//    //class properties
//    val rect = Rectangle(50,50)
//    println(rect.isSquare)
//
//    //enum
//    printColorRgb()
//
//    //when
//    println(getMnemonic(Color.YELLOW))
//
//    //while for
//    //printfizzBuzz()
//    printArrayList()
//
//    //exception
//    //testException()
//
//    //collection
//    printCollectionJavaClass()
//
//    //tostring
//    printToString()
//
//    //extension fun
//    printExtensionFun()
//    printExtensionToStringFun()
//
//    //extension property
//    printExtensionProperty()
//
//    testImplements()
//}

//fun main() = runBlocking{
//    launch {
//        delay(1000L)
//        println("BBB")
//    }
//    println("hello")
//    delay(2000)
//    println("AAA")
//
//    var time = measureTimeMillis {  }
//}

import kotlinx.coroutines.*

//fun main() = runBlocking { // this: CoroutineScope
//    launch {
//        delay(200L)
//        println("Task from runBlocking")
//    }
//
//    runBlocking { // 创建一个协程作用域
//        launch {
//            delay(500L)
//            println("Task from nested launch")
//        }
//
//        delay(100L)
//        println("Task from coroutine scope") // 这一行会在内嵌 launch 之前输出
//    }
//
//    println("Coroutine scope is over") // 这一行在内嵌 launch 执行完毕后才输出
//}
const val LOGO_URL = "http://www.imooc.com/static/img/index/logo.png?t=1.1"

fun main() = runBlocking {
    log("协程之前")
    myStartCoroutine{
        log("协程开始")
        val image = myloadpicturesfun(LOGO_URL)
        log("拿到图片")
    }
    log("协程之后")
    log("做其他操作")

    coroutineScope {
        launch {
            delay(1000)
            log("111")
        }
    }

    log("2222")
}
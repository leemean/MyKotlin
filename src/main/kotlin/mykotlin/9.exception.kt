package main.mykotlin

import java.lang.IllegalArgumentException

fun testException(){
    val input = readLine()
    if(input?.toInt() !in 0..100){
        throw IllegalArgumentException("must between 0 and 100")
    }
}
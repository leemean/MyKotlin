package main.mykotlin

var StringBuilder.lastCharProperty:Char
    get() = get(length - 1)
    set(value:Char){
        this.setCharAt(length - 1,value)
    }

fun printExtensionProperty(){
    val sb = StringBuilder("kotlin")
    println(sb?.lastCharProperty)
    sb.lastCharProperty = '!'
    println(sb)
}
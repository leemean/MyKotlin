package main.mykotlin

fun String.lastChar() :Char = this.get(this.length - 1)

fun String.lastChar2() :Char = get(length - 1)

fun printExtensionFun() = println("Kotlin".lastChar())

fun Collection<String>.joinToString(
    separator:String,
    prefix:String,
    postfix:String
):String{
    val result = StringBuilder(prefix)
    for((index,element) in this.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
val list1 = arrayListOf(1,2,3,4,5)
fun printExtensionToStringFun(){
    println(list1.joinToString(";","(",")"))
}
package main.mykotlin

val set1 = hashSetOf(1,7,53)
val arraylist1 = arrayListOf(1,7,53)
val map1 = hashMapOf(1 to "one",7 to "seven",53 to "fifty-three")

fun printCollectionJavaClass(){
    println(set1.javaClass)
    println(arraylist1.javaClass)
    println(map1.javaClass)
}
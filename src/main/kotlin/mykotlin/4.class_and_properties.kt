package main.mykotlin

class Person{
    val name:String = ""
    var isMarried:Boolean = false
}

class Rectangle(val height:Int,val width:Int){
    val isSquare:Boolean
//        get(){
//            return height == width
//        }
        get() = height == width
}
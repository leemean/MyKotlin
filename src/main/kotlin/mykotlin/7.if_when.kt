package main.mykotlin

import java.lang.IllegalArgumentException

interface Expr
class Num(val value:Int) : Expr
class Sum(val left:Expr,val right:Expr):Expr

fun eval(e:Expr):Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("unknown expression")
}

fun eval2(e:Expr):Int =
    if(e is Num){
        e.value
    } else if(e is Sum){
        eval(e.left)+ eval(e.right)
    }else {
        throw IllegalArgumentException("unknown expression")
    }

fun eval3(e:Expr) : Int =
        when(e){
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
            else -> throw IllegalArgumentException("unknown expression")
        }
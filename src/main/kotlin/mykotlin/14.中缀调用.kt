package main.mykotlin

val map11 = mapOf(1 to "one",7 to "seven",53 to "fifty-three")

//解构声明
fun destructuringDeclare(){
    val (number,name) = 1 to "one"
}

infix fun Any.to(other: Any) = Pair(this, other)
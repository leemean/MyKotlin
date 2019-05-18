package main.mykotlin

fun fizzBuzz(i:Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun printfizzBuzz(){
    //1-100
    for(i in 1..100){
        print(fizzBuzz(i))
    }

    println("for downto step")

    //100-1
    for(i in 100 downTo 1 step 1){
        print(fizzBuzz(i))
    }

    println("for until")

    //0-99
    for(i in 0 until 100){
        print(fizzBuzz(i))
    }
}

val list = arrayListOf("10","11","1001")
fun printArrayList(){
    for((index,element) in list.withIndex()){
        println("$index:$element")
    }
}
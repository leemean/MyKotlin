package main.mykotlin

import main.mykotlin.Color.*

fun getMnemonic(color:Color) =
        when (color){
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.BLUE -> "Battle"
            Color.GREEN -> "Gave"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
            else -> ""
        }

fun getWarmth(color:Color) =
        when (color) {
            Color.RED,Color.YELLOW,Color.ORANGE -> "warm"
            Color.GREEN -> "neutral"
            Color.BLUE,Color.INDIGO,Color.VIOLET -> "cold"
            else -> throw Exception("dirty color")
        }

fun getMix(c1:Color,c2:Color) : Color{
    val mix = when (setOf(c1,c2)){
        setOf(RED,YELLOW) -> ORANGE
        setOf(YELLOW,BLUE) -> GREEN
        setOf(BLUE,VIOLET) -> INDIGO
        else -> throw Exception("dirty color")
    }
    return mix
}

fun mixOpt(c1:Color,c2:Color) =
        when{
            c1 == RED && c2 == YELLOW -> Color.ORANGE
            else -> throw Exception("dirty color")
        }
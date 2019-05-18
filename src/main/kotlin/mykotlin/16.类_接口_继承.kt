package main.mykotlin

interface Clickable{
    fun click()
    fun showoff() = println("i'm clickable")
}

interface Focusable {
    fun setFocus(b: Boolean) =  println("I ${if(b)"got" else "lost"} focus")
    fun showoff () = println("i'm focusable")
}

class Button : Clickable,Focusable{
    override fun showoff() {
        super<Clickable>.showoff()
        super<Focusable>.showoff()
    }
    override fun click() {
        println("i was clicked")
    }
}

fun testImplements()
{
    val button = Button()
    button.showoff()
    button.setFocus(true)
    button.click()
    button.setFocus(false)
}
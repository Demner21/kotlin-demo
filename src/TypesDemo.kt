fun main(args: Array<String>) {
    arrays()
    ranges()
}

fun arrays() {
    var names = arrayOf("Jhon", "Jane")
    println(names.toList())
}

fun ranges() {
    val progression = 10 downTo 1
    for (x in progression) {
        println(x)
    }

}

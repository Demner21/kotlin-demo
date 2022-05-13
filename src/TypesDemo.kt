fun main(args: Array<String>) {
//    arrays()
//    ranges()
    using_when("3")
    using_when("v")
    using_when("z")

    string_template("test string template")
}

fun string_template(message: String) {
    println("the message is $message")
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

fun using_when(value_to_evaluate: Any){
    when (value_to_evaluate) {
        "v" -> println("string case")
        "3" -> println("case with number 3")
        else -> {
            println("default case ")
        }
    }
}

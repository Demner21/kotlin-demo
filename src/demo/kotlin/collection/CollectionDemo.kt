package demo.kotlin.collection

fun main(args:Array<String>) {
    val sequence = generateSequence(2) { it + 2 }
    val take = sequence.take(10)
    println(take.toList())
}
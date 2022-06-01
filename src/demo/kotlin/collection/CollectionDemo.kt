package demo.kotlin.collection

fun main(args:Array<String>) {
    val sequence = generateSequence(2) { it + 2 }
    val intSequence: Sequence<Int> = sequence.take(10)
    println(intSequence.toList())
    println("intSequence are > 2 ${intSequence.all { it > 2 }}" )
    println("intSequence are odd ${intSequence.all { it % 2 == 0 }}" )

    //using an empty sequence
    println(emptySequence<Int>().any())
    println("intSequence contains 20? ${intSequence.contains(20)}")
    println("intSequence contains 30? ${intSequence.contains(30)}")
    println("total numbers of elements of intSequence: ${intSequence.count()}")
    println("total numbers of elements of intSequence > 4: ${intSequence.count { it > 4 }}")



}
fun main() {
    println("hello there")
    val person = Person("Khan")
    val arrayOfData = person.getArrayOfData()

    val arrayOf = arrayOf("cielo", "fanta")

    val newDataArray = arrayOfData + arrayOf;
    newDataArray.forEach { println(it) }

    println(newDataArray.joinToString("::"))

    val ints = Array<Int>(5) { 1 }
    println(ints.joinToString())

    println(arrayOf contentEquals newDataArray)
    println(arrayOf contentEquals ints)
    println(newDataArray contentEquals ints)
    println(newDataArray.size)
    println(newDataArray.indices)

    val newData = newDataArray.indices.map { it * 2 }
    newData.forEach { println(it) }

    println(newDataArray.lastIndex)

    println("---------------------")
    println(newData.all { it % 2 == 0 })
    println(newData.component2())


}

fun getData(): String {
    return "A"
}

class Person(private val firstName: String) {
    fun getFirstLetterOfName(): String {
        return firstName[0].uppercase()
    }

    fun getArrayOfData(): Array<String> {
        return arrayOf("function", "linear", "tetris")
    }
}


class Quiz45 {
    fun getPascalTriangle(numberOfRows: Int): Array<Array<Int>> {
        val array = Array(numberOfRows) { Array(numberOfRows) { 0 } }
        println(array.contentDeepToString())

        for (line in 0..<numberOfRows) {
            for (i in 0..line) {
                if (line == i || i == 0) {
                    array[line][i] = 1;
                } else {
                    array[line][i] = array[line - 1][i - 1] + array[line - 1][i]
                }
            }
        }
        return array
    }
}
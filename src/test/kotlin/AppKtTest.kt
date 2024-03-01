import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class AppKtTest : FunSpec({

    beforeTest {
        println("Starting a test $it")
    }

    test("getData") {
        getData() shouldBe "A"
    }

    test("firstLetterOfName") {
        var person = Person("demner")
        person.getFirstLetterOfName() shouldBe "D"
    }

    test("get pascal triangle of number 2") {
        val quiz45 = Quiz45()
        val expectedArray = arrayOf(arrayOf(1, 0), arrayOf(1, 1))
        println(expectedArray.contentDeepToString())
        val pascalTriangle = quiz45.getPascalTriangle(2)
        pascalTriangle shouldBe expectedArray
    }


    listOf(
        Pair(2, arrayOf(arrayOf(1, 0), arrayOf(1, 1))),
        Pair(3, arrayOf(arrayOf(1, 0, 0), arrayOf(1, 1, 0), arrayOf(1, 2, 1)))
    ).forEach {
        test("get pascal triangle for ${it.first}") {
            val quiz45 = Quiz45()
            val pascalTriangle = quiz45.getPascalTriangle(it.first)
            pascalTriangle shouldBe it.second
        }
    }
})


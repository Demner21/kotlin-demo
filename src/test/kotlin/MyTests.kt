import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe

class MyTests : ShouldSpec({
    should("return the length of the string") {
        "sammy".length shouldBe 5
        "".length shouldBe 0
    }
    should("data from person be an array") {
        val person = Person("Tom")
        person.getArrayOfData() shouldHaveSize 3
    }
})
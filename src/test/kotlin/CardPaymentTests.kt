import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.mockk.impl.annotations.RelaxedMockK

class CardPaymentTests : BehaviorSpec({

    @RelaxedMockK
    lateinit var person: Person

    beforeTest {
        println("before test hook")
        person = Person("Flagg")
    }

    given("I have sufficient balance") {
        `when`("I make a card payment") {
            then("The card payment should be successful") {
                // test code
                person.getFirstLetterOfName() shouldBe "F"
            }
        }
        `when`("I make a card payment 2") {
            then("The card payment should be successful") {
                // test code
                person.getFirstLetterOfName() shouldBe "F"
            }
        }
    }
})
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class HelloScreenTest {
    lateinit var helloScreen: HelloScreen

    @BeforeEach
    fun setUp() {
        helloScreen = HelloScreen()
    }

    @Test
    fun `doSomething`() {
        assertTrue(helloScreen.doSomething())
    }

    @Test
    fun `doSomethingElse`() {
        assertTrue(helloScreen.doSomethingElse())
    }
}
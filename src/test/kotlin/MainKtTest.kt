import org.junit.Assert.assertEquals
import org.junit.Test

internal class MainKtTest {

    @Test
    fun day01Test() {
        assertEquals(514579, Day01().solveSumTwo(listOf(1721, 979, 366, 299, 675, 1456)))
    }
}
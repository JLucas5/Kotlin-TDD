package github.jlucas5.kotlin

import org.junit.Test
import kotlin.test.assertEquals
import github.jlucas5.kotlin.LeapYearIdentifier
import

class LeapYearTest {

    val calculator = LeapYearIdentifier()

    @Test
    fun whenItsLeapYear(){
         assertEquals(true, calculator.isBissexto(2012), e)
    }

    @Test
    fun whenItsNotDivBy4(){
        assertEquals(false, calculator.isBissexto(1001), e)
    }

    @Test
    fun whenItsDivBy100and400(){
        assertEquals(true, calculator.isBissexto(1200), e)
    }

    @Test
    fun whenItsNotDivBy400(){
        assertEquals(false, calculator.isBissexto(1000), e)
    }

    Assertions
}

package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.div(long, long)
 * Group: "arithmetic"
 */
@Test(groups = {"arithmetic"})
public class DivLongTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[DivLongTest] Initializing test class");
    }

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        calculator = null;
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("[DivLongTest] All tests finished");
    }

    /**
     * Test div(long, long) with various inputs from data provider
     * @param a dividend
     * @param b divisor
     * @param expected expected result of division
     */
    @Test(dataProvider = "divLongData", dataProviderClass = TestData.class)
    public void testDivLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.div(a, b), expected,
                String.format("div(%d, %d) should be %d", a, b, expected));
    }

    /**
     * Test that dividing a long by zero throws NumberFormatException with appropriate message.
     */
    @Test(expectedExceptions = NumberFormatException.class,
            expectedExceptionsMessageRegExp = ".*divide by zero.*")
    public void testDivLongByZeroThrows() {
        calculator.div(10L, 0L);
    }

    /**
     * Test division of a negative long by another negative long, expecting a positive result.
     */
    @Test
    public void testDivLongNegativeByNegative() {
        Assert.assertEquals(calculator.div(-9L, -3L), 3L);
    }
}
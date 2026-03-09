package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.sub(long, long)
 * Group: "arithmetic"
 */
@Test(groups = {"arithmetic"})
public class SubLongTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[SubLongTest] Initializing test class");
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
        System.out.println("[SubLongTest] All tests finished");
    }

    /**
     * Test subtraction of longs with various inputs, including edge cases.
     * @param a minuend
     * @param b subtrahend
     * @param expected expected result of subtraction
     */
    @Test(dataProvider = "subLongData", dataProviderClass = TestData.class)
    public void testSubLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.sub(a, b), expected,
                String.format("sub(%d, %d) should be %d", a, b, expected));
    }

    /**
     * Test that subtracting a smaller positive long from a larger one returns the correct positive result.
     */
    @Test
    public void testSubLongPositiveResult() {
        Assert.assertEquals(calculator.sub(10L, 4L), 6L);
    }

    /**
     * Test that subtracting a positive long from a smaller one returns the correct negative result.
     */
    @Test
    public void testSubLongNegativeResult() {
        Assert.assertEquals(calculator.sub(4L, 10L), -6L);
    }

    /**
     * Test that subtracting same long values returns zero.
     */
    @Test
    public void testSubLongSameValues() {
        Assert.assertEquals(calculator.sub(7L, 7L), 0L);
    }
}
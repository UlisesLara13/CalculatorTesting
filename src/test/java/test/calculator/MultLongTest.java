package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.mult(long, long)
 * Group: "arithmetic"
 */
@Test(groups = {"arithmetic"})
public class MultLongTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[MultLongTest] Initializing test class");
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
        System.out.println("[MultLongTest] All tests finished");
    }

    /**
     * Data-driven test for mult(long, long) using TestData.multLongData provider
     * @param a first long operand
     * @param b second long operand
     * @param expected expected result of multiplication
     */
    @Test(dataProvider = "multLongData", dataProviderClass = TestData.class)
    public void testMultLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.mult(a, b), expected,
                String.format("mult(%d, %d) should be %d", a, b, expected));
    }

    /**
     * Test that multiplying a long by zero returns zero.
     */
    @Test
    public void testMultLongByZero() {
        Assert.assertEquals(calculator.mult(999L, 0L), 0L);
    }

    /**
     * Test multiplication of a negative long and a positive long, expecting a negative result.
     */
    @Test
    public void testMultLongNegativePositive() {
        Assert.assertEquals(calculator.mult(-5L, 4L), -20L);
    }
}
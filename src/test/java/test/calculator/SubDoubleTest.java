package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.sub(double, double)
 * Group: "arithmetic"
 */
@Test(groups = {"arithmetic"})
public class SubDoubleTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[SubDoubleTest] Initializing test class");
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
        System.out.println("[SubDoubleTest] All tests finished");
    }

    /**
     * Test subtraction of doubles with various inputs, including edge cases.
     * @param a minuend
     * @param b subtrahend
     * @param expected expected result of subtraction
     * @param delta tolerance for floating-point comparison
     */
    @Test(dataProvider = "subDoubleData", dataProviderClass = TestData.class)
    public void testSubDouble(double a, double b, double expected, double delta) {
        Assert.assertEquals(calculator.sub(a, b), expected, delta);
    }

    /**
     * Test that subtracting a smaller positive double from a larger one returns the correct positive result.
     */
    @Test
    public void testSubDoublePositive() {
        Assert.assertEquals(calculator.sub(10.5, 0.5), 10.0, 0.001);
    }

    /**
     * Test that subtracting a positive double from a negative one returns the correct negative result.
     */
    @Test
    public void testSubDoubleNegative() {
        Assert.assertEquals(calculator.sub(-4.0, 1.0), -5.0, 0.001);
    }
}
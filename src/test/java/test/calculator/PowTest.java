package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.pow(double, double)
 * Group: "scientific"
 */
@Test(groups = {"scientific"})
public class PowTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[PowTest] Initializing test class");
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
        System.out.println("[PowTest] All tests finished");
    }

    /**
     * Test Calculator.pow with various bases and exponents, including edge cases.
     * @param base the base value
     * @param exp the exponent value
     * @param expected the expected result of base raised to exp
     * @param delta the tolerance for floating-point comparison
     */
    @Test(dataProvider = "powData", dataProviderClass = TestData.class)
    public void testPow(double base, double exp, double expected, double delta) {
        Assert.assertEquals(calculator.pow(base, exp), expected, delta,
                String.format("pow(%f, %f) should be ~%f", base, exp, expected));
    }

    /**
     * Test that raising a number to a negative exponent returns the correct reciprocal value.
     */
    @Test
    public void testPowNegativeExponent() {
        Assert.assertEquals(calculator.pow(2.0, -2.9), 0.125, 0.001);
    }
}
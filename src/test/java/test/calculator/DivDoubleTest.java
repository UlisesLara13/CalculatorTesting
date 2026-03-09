package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.div(double, double)
 * Group: "arithmetic"
 */
@Test(groups = {"arithmetic"})
public class DivDoubleTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[DivDoubleTest] Initializing test class");
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
        System.out.println("[DivDoubleTest] All tests finished");
    }

    /**
     * Test division of doubles with various inputs, including edge cases.
     * @param a dividend
     * @param b divisor
     * @param expected expected result of division
     * @param delta tolerance for floating-point comparison
     */
    @Test(dataProvider = "divDoubleData", dataProviderClass = TestData.class)
    public void testDivDouble(double a, double b, double expected, double delta) {
        Assert.assertEquals(calculator.div(a, b), expected, delta);
    }

    /**
     * Test that dividing a double by zero returns Infinity.
     */
    @Test
    public void testDivDoubleByZeroReturnsInfinity() {
        double result = calculator.div(5.0, 0.0);
        Assert.assertTrue(Double.isInfinite(result),
                "div by 0.0 should return Infinity");
    }
}
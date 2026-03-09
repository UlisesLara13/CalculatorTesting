package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.sum(double, double)
 * Group: "arithmetic"
 */
@Test(groups = {"arithmetic"})
public class SumDoubleTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[SumDoubleTest] Initializing test class");
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
        System.out.println("[SumDoubleTest] All tests finished");
    }

    /**
     * Test addition of doubles with various inputs, including edge cases.
     * @param a first addend
     * @param b second addend
     * @param expected expected result of addition
     * @param delta tolerance for floating-point comparison
     */
    @Test(dataProvider = "sumDoubleData", dataProviderClass = TestData.class)
    public void testSumDouble(double a, double b, double expected, double delta) {
        Assert.assertEquals(calculator.sum(a, b), expected, delta,
                String.format("sum(%f, %f) should be ~%f", a, b, expected));
    }

    /**
     * Test that adding two positive doubles returns the correct positive result.
     */
    @Test
    public void testSumDoublePositive() {
        Assert.assertEquals(calculator.sum(3.14, 2.86), 6.0, 0.001);
    }

    /**
     * Test that adding two negative doubles returns the correct negative result.
     */
    @Test
    public void testSumDoubleNegative() {
        Assert.assertEquals(calculator.sum(-1.1, -2.2), -3.3, 0.001);
    }
}

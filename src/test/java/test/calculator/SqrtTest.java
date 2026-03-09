package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.sqrt(double)
 * Group: "scientific"
 */
@Test(groups = {"scientific"})
public class SqrtTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[SqrtTest] Initializing test class");
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
        System.out.println("[SqrtTest] All tests finished");
    }

    /**
     * Test sqrt with various inputs from data provider
     * @param input the value to compute the square root of
     * @param expected the expected result of the square root calculation
     * @param delta the acceptable delta for floating-point comparison
     */
    @Test(dataProvider = "sqrtData", dataProviderClass = TestData.class)
    public void testSqrt(double input, double expected, double delta) {
        Assert.assertEquals(calculator.sqrt(input), expected, delta,
                String.format("sqrt(%f) should be ~%f", input, expected));
    }

    /**
     * Test that sqrt of a perfect square returns the correct integer value,
     * which is a fundamental property of the square root function.
     */
    @Test
    public void testSqrtPerfectSquare() {
        Assert.assertEquals(calculator.sqrt(100.0), 10.0, 0.001);
    }

    /**
     * Test that sqrt of a negative number returns the square root of its absolute value,
     * which is a specific behavior of this implementation of the square root function.
     */
    @Test
    public void testSqrtNegativeInputAbsApplied() {
        Assert.assertEquals(calculator.sqrt(-16.0), 4.0, 0.001);
    }
}
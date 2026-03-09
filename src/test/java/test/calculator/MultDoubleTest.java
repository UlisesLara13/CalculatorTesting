package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.mult(double, double)
 * Group: "arithmetic"
 */
@Test(groups = {"arithmetic"})
public class MultDoubleTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[MultDoubleTest] Initializing test class");
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
        System.out.println("[MultDoubleTest] All tests finished");
    }

    /**
     * Test multiplication of two doubles with various values, including edge cases.
     * @param a first operand
     * @param b second operand
     * @param expected expected result of multiplication
     * @param delta tolerance for floating-point comparison
     */
    @Test(dataProvider = "multDoubleData", dataProviderClass = TestData.class)
    public void testMultDouble(double a, double b, double expected, double delta) {
        Assert.assertEquals(calculator.mult(a, b), expected, delta,
                String.format("mult(%f, %f) should be ~%f (floor applied)", a, b, expected));
    }

    /**
     * Test that multiplying a double by zero returns zero.
     */
    @Test
    public void testMultDoubleByZero() {
        Assert.assertEquals(calculator.mult(99.9, 0.0), 0.0, 0.001);
    }
}
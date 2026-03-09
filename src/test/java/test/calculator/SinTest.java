package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.sin(double)
 * Group: "trigonometric"
 */
@Test(groups = {"trigonometric"})
public class SinTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[SinTest] Initializing test class");
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
        System.out.println("[SinTest] All tests finished");
    }

    /**
     * Test sin function with various angles using data provider
     * @param angle - input angle in radians
     * @param expected - expected sin value
     * @param delta - acceptable delta for floating-point comparison
     */
    @Test(dataProvider = "sinData", dataProviderClass = TestData.class)
    public void testSin(double angle, double expected, double delta) {
        Assert.assertEquals(calculator.sin(angle), expected, delta,
                String.format("sin(%f) should be ~%f", angle, expected));
    }

    /**
     * Test that sin(0) returns 0, which is a fundamental property of the sine function.
     */
    @Test
    public void testSinZero() {
        Assert.assertEquals(calculator.sin(0.0), 0.0, 0.001);
    }

    /**
     * Test that sin(-π/6) returns -0.5, which is a known value of the sine function at this angle.
     */
    @Test
    public void testSinNegative() {
        Assert.assertEquals(calculator.sin(-Math.PI / 6), -0.5, 0.001);
    }
}
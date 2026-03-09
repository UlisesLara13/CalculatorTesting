package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.tg(double)
 * Group: "trigonometric"
 */
@Test(groups = {"trigonometric"})
public class TgTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[TgTest] Initializing test class");
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
        System.out.println("[TgTest] All tests finished");
    }

    /**
     * Test tg function with various angles using data provider
     * @param angle - input angle in radians
     * @param expected - expected tg value
     * @param delta - acceptable delta for floating-point comparison
     */
    @Test(dataProvider = "tgData", dataProviderClass = TestData.class)
    public void testTg(double angle, double expected, double delta) {
        Assert.assertEquals(calculator.tg(angle), expected, delta,
                String.format("tg(%f) should be ~%f (cos delegates to sin)", angle, expected));
    }

    /**
     * Test that tg(0) returns NaN, which is a specific behavior of this implementation of the tangent function
     * due to how it delegates to sine and cosine, resulting in an indeterminate form (0/0).
     */
    @Test
    public void testTgAtZeroIsNaN() {
        double result = calculator.tg(0.0);
        Assert.assertTrue(Double.isNaN(result),
                "tg(0) should be NaN because cos delegates to sin → 0/0");
    }
}
package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.ctg(double)
 * Group: "trigonometric"
 */
@Test(groups = {"trigonometric"})
public class CtgTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[CtgTest] Initializing test class");
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
        System.out.println("[CtgTest] All tests finished");
    }

    /**
     * Test ctg with various angles using data provider
     * @param angle input angle in radians
     * @param expected expected ctg value
     * @param delta allowed delta for floating point comparison
     */
    @Test(dataProvider = "ctgData", dataProviderClass = TestData.class)
    public void testCtg(double angle, double expected, double delta) {
        Assert.assertEquals(calculator.ctg(angle), expected, delta,
                String.format("ctg(%f) delegates to tanh → expected %f", angle, expected));
    }

    /**
     * Test ctg at zero, which should return 0.0 due to delegation to tanh(0) = 0
     */
    @Test
    public void testCtgZero() {
        Assert.assertEquals(calculator.ctg(0.0), 0.0, 0.001);
    }
}
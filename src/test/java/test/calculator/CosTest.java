package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.cos(double)
 * Group: "trigonometric"
 */
@Test(groups = {"trigonometric"})
public class CosTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[CosTest] Initializing test class");
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
        System.out.println("[CosTest] All tests finished");
    }

    /**
     * Test cos(angle) should match expected values from data provider, which are based on Math.cos(angle).
     * @param angle input angle in radians
     * @param expected expected cosine value for the given angle
     * @param delta tolerance for floating-point comparison
     */
    @Test(dataProvider = "cosData", dataProviderClass = TestData.class)
    public void testCos(double angle, double expected, double delta) {
        Assert.assertEquals(calculator.cos(angle), expected, delta,
                String.format("cos(%f) delegates to Math.sin → expected %f", angle, expected));
    }

    /**
     * Test cos(0) should be 0.0 due to delegation to sin(0) = 0
     */
    @Test
    public void testCosAtZero() {
        Assert.assertEquals(calculator.cos(0.0), 0.0, 0.001);
    }
}
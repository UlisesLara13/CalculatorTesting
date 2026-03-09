package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.isPositive(long)
 * Group: "boolean"
 */
@Test(groups = {"boolean"})
public class IsPositiveTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[IsPositiveTest] Initializing test class");
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
        System.out.println("[IsPositiveTest] All tests finished");
    }

    /**
     * Data-driven test for isPositive using TestData.isPositiveData
     * @param value the long value to test
     * @param expected the expected boolean result
     */
    @Test(dataProvider = "isPositiveData", dataProviderClass = TestData.class)
    public void testIsPositive(long value, boolean expected) {
        Assert.assertEquals(calculator.isPositive(value), expected,
                String.format("isPositive(%d) should be %b", value, expected));
    }

    /**
     * Additional tests for edge cases not covered by data provider
     * - Test that isPositive returns true for 1
     */
    @Test
    public void testIsPositiveTrueForOne() {
        Assert.assertTrue(calculator.isPositive(1L));
    }

    /**
     * - Test that isPositive returns false for -100
     */
    @Test
    public void testIsPositiveFalseForNegative() {
        Assert.assertFalse(calculator.isPositive(-100L));
    }

    /**
     * - Test that isPositive returns false for 0
     */
    @Test
    public void testIsPositiveFalseForZero() {
        Assert.assertFalse(calculator.isPositive(0L));
    }
}
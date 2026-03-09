package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.isNegative(long)
 * Group: "boolean"
 */
@Test(groups = {"boolean"})
public class IsNegativeTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[IsNegativeTest] Initializing test class");
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
        System.out.println("[IsNegativeTest] All tests finished");
    }

    /**
     * Data-driven test for isNegative using TestData provider
     * @param value input value to test
     * @param expected expected result (true if value is negative, false otherwise)
     */
    @Test(dataProvider = "isNegativeData", dataProviderClass = TestData.class)
    public void testIsNegative(long value, boolean expected) {
        Assert.assertEquals(calculator.isNegative(value), expected,
                String.format("isNegative(%d) should be %b", value, expected));
    }

    /**
     * Additional tests for edge cases
     * - Negative value should return true
     */
    @Test
    public void testIsNegativeTrueForNegativeValue() {
        Assert.assertTrue(calculator.isNegative(-50L));
    }

    /**
     * - Zero should return false
     */
    @Test
    public void testIsNegativeFalseForZero() {
        Assert.assertFalse(calculator.isNegative(0L));
    }

    /**
     * - Positive value should return false
     */
    @Test
    public void testIsNegativeFalseForPositive() {
        Assert.assertFalse(calculator.isNegative(50L));
    }
}
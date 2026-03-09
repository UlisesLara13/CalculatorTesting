package test.calculator;

import com.epam.tat.module4.Calculator;
import test.data.TestData;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit tests for Calculator.sum(long, long)
 * Group: "arithmetic"
 */
@Test(groups = {"arithmetic"})
public class SumLongTest {

    private Calculator calculator;

    @BeforeClass
    public void setUpClass() {
        System.out.println("[SumLongTest] Initializing test class");
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
        System.out.println("[SumLongTest] All tests finished");
    }

    /**
     * Data-driven test for sum using TestData.sumLongData
     * @param a first long value
     * @param b second long value
     * @param expected expected result of sum
     */
    @Test(dataProvider = "sumLongData", dataProviderClass = TestData.class)
    public void testSumLong(long a, long b, long expected) {
        Assert.assertEquals(calculator.sum(a, b), expected,
                String.format("sum(%d, %d) should be %d", a, b, expected));
    }

    /**
     * Additional tests
     * - Test that sum of two positive longs returns correct result
     */
    @Test
    public void testSumLongPositiveNumbers() {
        Assert.assertEquals(calculator.sum(10L, 20L), 30L);
    }

    /**
     * - Test that sum of two negative longs returns correct result
     */
    @Test
    public void testSumLongNegativeNumbers() {
        Assert.assertEquals(calculator.sum(-10L, -20L), -30L);
    }

    /**
     * - Test that sum zero with zero returns zero
     */
    @Test
    public void testSumLongZero() {
        Assert.assertEquals(calculator.sum(0L, 0L), 0L);
    }
}
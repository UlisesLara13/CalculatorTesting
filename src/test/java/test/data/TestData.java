package test.data;

import org.testng.annotations.DataProvider;

/**
 * Test data providers for Calculator unit tests
 */
public class TestData {

    /**
     * Data providers for SumLong operations
     * @return 2D array of test data for sum of long values
     */
    @DataProvider(name = "sumLongData")
    public static Object[][] sumLongData() {
        return new Object[][] {
                {  2L,   3L,   5L },
                { -1L,   1L,   0L },
                {  0L,   0L,   0L },
                { Long.MAX_VALUE,  0L, Long.MAX_VALUE },
                { Long.MIN_VALUE,  0L, Long.MIN_VALUE },
                { -5L,  -3L,  -8L },
                { 100L, 200L, 300L }
        };
    }

    /**
     * Data providers for SumDouble operations
     * @return 2D array of test data for sum of double values, including expected results and delta for comparison
     */
    @DataProvider(name = "sumDoubleData")
    public static Object[][] sumDoubleData() {
        return new Object[][] {
                {  1.5,  2.5,  4.0, 0.001 },
                { -1.5,  1.5,  0.0, 0.001 },
                {  0.0,  0.0,  0.0, 0.001 },
                {  0.1,  0.2,  0.3, 0.001 },
                { -3.3, -2.2, -5.5, 0.001 },
        };
    }

    /**
     * Data providers for SubLong operations
     * @return 2D array of test data for subtraction of long values
     */
    @DataProvider(name = "subLongData")
    public static Object[][] subLongData() {
        return new Object[][] {
                {  5L,  3L,  2L },
                {  0L,  0L,  0L },
                { -1L, -1L,  0L },
                {  3L,  5L, -2L },
                { Long.MAX_VALUE, Long.MAX_VALUE, 0L },
        };
    }

    /**
     * Data providers for SubDouble operations
     * @return 2D array of test data for subtraction of double values, including expected results and delta for comparison
     */
    @DataProvider(name = "subDoubleData")
    public static Object[][] subDoubleData() {
        return new Object[][] {
                {  5.5,  2.5,  3.0, 0.001 },
                {  0.0,  0.0,  0.0, 0.001 },
                { -2.0, -1.0, -1.0, 0.001 },
                {  1.0,  3.0, -2.0, 0.001 },
        };
    }

    /**
     * Data providers for MultLong operations
     * @return 2D array of test data for multiplication of long values
     */
    @DataProvider(name = "multLongData")
    public static Object[][] multLongData() {
        return new Object[][] {
                {  3L,  4L, 12L },
                {  0L,  5L,  0L },
                { -2L,  3L, -6L },
                { -2L, -3L,  6L },
                {  1L,  1L,  1L },
        };
    }

    /**
     * Data providers for MultDouble operations
     * @return 2D array of test data for multiplication of double values, including expected results and delta for comparison
     */
    @DataProvider(name = "multDoubleData")
    public static Object[][] multDoubleData() {
        return new Object[][] {
                {  2.0,  3.0,  6.0, 0.001 },
                {  2.5,  2.5,  6.0, 0.001 },
                {  0.0,  5.0,  0.0, 0.001 },
                { -2.0,  3.0, -6.0, 0.001 },
                {  1.9,  1.9,  3.0, 0.001 },
        };
    }

    /**
     * Data providers for DivLong operations
     * @return 2D array of test data for division of long values, including expected results
     */
    @DataProvider(name = "divLongData")
    public static Object[][] divLongData() {
        return new Object[][] {
                { 10L,  2L,  5L },
                {  9L,  3L,  3L },
                { -6L,  2L, -3L },
                {  7L,  2L,  3L },
                {  0L,  5L,  0L },
        };
    }

    /**
     * Data providers for DivDouble operations
     * @return 2D array of test data for division of double values, including expected results and delta for comparison
     */
    @DataProvider(name = "divDoubleData")
    public static Object[][] divDoubleData() {
        return new Object[][] {
                { 10.0,  2.0,  5.0, 0.001 },
                {  7.5,  2.5,  3.0, 0.001 },
                { -6.0,  2.0, -3.0, 0.001 },
                {  0.0,  5.0,  0.0, 0.001 },
        };
    }
    /**
     * Data providers for PowDouble operations
     * @return 2D array of test data for power of double values, including expected results and delta for comparison
     */
    @DataProvider(name = "powData")
    public static Object[][] powData() {
        return new Object[][] {
                {  2.0,  3.0,   8.0, 0.001 },
                {  2.0,  3.9,   8.0, 0.001 },
                {  5.0,  0.0,   1.0, 0.001 },
                {  0.0,  5.0,   0.0, 0.001 },
                {  3.0,  2.0,   9.0, 0.001 },
                { 10.0,  2.0, 100.0, 0.001 },
        };
    }

    /**
     * Data providers for SqrtDouble operations
     * @return 2D array of test data for square root of double values, including expected results and delta for comparison
     */
    @DataProvider(name = "sqrtData")
    public static Object[][] sqrtData() {
        return new Object[][] {
                {   4.0,  2.0,           0.001 },
                {   9.0,  3.0,           0.001 },
                {   0.0,  0.0,           0.001 },
                {   1.0,  1.0,           0.001 },
                {   2.0,  Math.sqrt(2),  0.001 },
                {  -4.0,  2.0,           0.001 },
                { -25.0,  5.0,           0.001 },
        };
    }

    /**
     * Data providers for TgDouble operations
     * @return 2D array of test data for tangent of double values, including expected results and delta for comparison
     */
    @DataProvider(name = "tgData")
    public static Object[][] tgData() {
        return new Object[][] {
                { Math.PI / 4, 1.0, 0.001 },
                { Math.PI / 6, 1.0, 0.001 },
                { Math.PI / 3, 1.0, 0.001 },
                { 1.0,         1.0, 0.001 },
        };
    }

    /**
     * Data providers for CtgDouble operations
     * @return 2D array of test data for cotangent of double values, including expected results and delta for comparison
     */
    @DataProvider(name = "ctgData")
    public static Object[][] ctgData() {
        return new Object[][] {
                {  0.0,  Math.tanh(0.0),  0.001 },
                {  1.0,  Math.tanh(1.0),  0.001 },
                { -1.0,  Math.tanh(-1.0), 0.001 },
                {  2.0,  Math.tanh(2.0),  0.001 },
        };
    }

    /**
     * Data providers for CosDouble operations
     * @return 2D array of test data for cosine of double values, including expected results and delta for comparison
     */
    @DataProvider(name = "cosData")
    public static Object[][] cosData() {
        return new Object[][] {
                { 0.0,          Math.sin(0.0),         0.001 },
                { Math.PI / 2,  Math.sin(Math.PI / 2), 0.001 },
                { Math.PI,      Math.sin(Math.PI),      0.001 },
                { 1.0,          Math.sin(1.0),          0.001 },
        };
    }

    /**
     * Data providers for SinDouble operations
     * @return 2D array of test data for sine of double values, including expected results and delta for comparison
     */
    @DataProvider(name = "sinData")
    public static Object[][] sinData() {
        return new Object[][] {
                {  0.0,          0.0,  0.001 },
                {  Math.PI / 2,  1.0,  0.001 },
                {  Math.PI,      0.0,  0.001 },
                { -Math.PI / 2, -1.0,  0.001 },
                {  Math.PI / 6,  0.5,  0.001 },
        };
    }

    /**
     * Data providers for IsPositiveLong operations
     * @return 2D array of test data for checking if long values are positive, including expected boolean results
     */
    @DataProvider(name = "isPositiveData")
    public static Object[][] isPositiveData() {
        return new Object[][] {
                {  1L,             true  },
                {  Long.MAX_VALUE, true  },
                {  0L,             false },
                { -1L,             false },
                {  Long.MIN_VALUE, false },
        };
    }

    /**
     * Data providers for IsNegativeLong operations
     * @return 2D array of test data for checking if long values are negative, including expected boolean results
     */
    @DataProvider(name = "isNegativeData")
    public static Object[][] isNegativeData() {
        return new Object[][] {
                { -1L,             true  },
                {  Long.MIN_VALUE, true  },
                {  0L,             false },
                {  1L,             false },
                {  Long.MAX_VALUE, false },
        };
    }
}

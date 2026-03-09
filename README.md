# Calculator Unit Testing — TestNG
Unit tests for the Calculator library using TestNG, covering all 16 methods with data-driven testing, groups, parallel execution, and pre/post conditions.

### Requirements

Add Calculator-1.0.jar to project references
One test class per Calculator method
Pre-conditions and post-conditions with TestNG annotations
XML suite configuration with at least one test group (include/exclude)
Parametrized tests using @DataProvider
Parallel execution


## 🏗️ Project Structure
```
CalculatorTesting/
├── libs/
│   └── Calculator-1.0.jar
├── screenshots/
│   ├── 01_all_tests_passing_xml_suite.png
│   ├── 02_parallel_execution_console.png
│   ├── 03_data_driven_sumlong.png
│   ├── 04_data_driven_divlong.png
│   ├── 05_group_arithmetic_xml.png
│   ├── 06_group_scientific_xml.png
│   ├── 07_group_trigonometric_xml.png
│   ├── 08_group_boolean_xml.png
│   ├── 09_mvn_clean_test_build_success.png
│   └── 10_exception_test_divlong_by_zero.png
├── src/
│   └── test/
│       ├── java/
│       │   └── test/calculator/
│       │       ├── TestData.java           # Centralized @DataProvider
│       │       ├── SumLongTest.java        # sum(long, long)
│       │       ├── SumDoubleTest.java      # sum(double, double)
│       │       ├── SubLongTest.java        # sub(long, long)
│       │       ├── SubDoubleTest.java      # sub(double, double)
│       │       ├── MultLongTest.java       # mult(long, long)
│       │       ├── MultDoubleTest.java     # mult(double, double)
│       │       ├── DivLongTest.java        # div(long, long)
│       │       ├── DivDoubleTest.java      # div(double, double)
│       │       ├── PowTest.java            # pow(double, double)
│       │       ├── SqrtTest.java           # sqrt(double)
│       │       ├── TgTest.java             # tg(double)
│       │       ├── CtgTest.java            # ctg(double)
│       │       ├── CosTest.java            # cos(double)
│       │       ├── SinTest.java            # sin(double)
│       │       ├── IsPositiveTest.java     # isPositive(long)
│       │       └── IsNegativeTest.java     # isNegative(long)
│       └── resources/
│           ├── all-tests.xml               # All groups
│           ├── arithmetic-tests.xml        # arithmetic group
│           ├── scientific-tests.xml        # scientific group
│           ├── trigonometric-tests.xml     # trigonometric group
│           └── boolean-tests.xml           # boolean group
├── pom.xml
└── README.md
```

### Test Groups

| Group | Classes |
|---|---|
| `arithmetic` | SumLong, SumDouble, SubLong, SubDouble, MultLong, MultDouble, DivLong, DivDouble |
| `scientific` | Pow, Sqrt |
| `trigonometric` | Tg, Ctg, Cos, Sin |
| `boolean` | IsPositive, IsNegative |

# HOW TO RUN:
## From IntelliJ: 
right-click any XML file → Run

## From Maven:
```
mvn clean test
mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/arithmetic-tests.xml
```

# 👨‍💻 Author
**Student:** Ulises Lara  
**Program:** EPAM Java Automation Specialization  
**Project:** Calculator Testing
**Date:** March 2026

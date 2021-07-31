package com.epam.tc.aleksandr_iablonskikh.hw1.addAndSubtractTestsPackage;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CalculatorSubtractTest {
    Calculator calculator = new Calculator();

    @Test(dataProvider = "")
    public void subtractTest() {
        double actualResult = calculator.sub(2,2);
        assertThat(actualResult)
                .as("Subtraction result")
                .isEqualTo(0);
    }
}

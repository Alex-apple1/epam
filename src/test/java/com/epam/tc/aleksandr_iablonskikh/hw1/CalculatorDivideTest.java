package com.epam.tc.aleksandr_iablonskikh.hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CalculatorDivideTest {

    Calculator calculator = new Calculator();

    @Test(dataProvider = "")
    public void divideTest() {
        double actualResult = calculator.div(2,2);
        assertThat(actualResult)
                .as("Dividing result")
                .isEqualTo(1);
    }
}

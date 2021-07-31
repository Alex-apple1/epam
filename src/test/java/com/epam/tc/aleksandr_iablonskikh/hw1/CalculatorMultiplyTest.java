package com.epam.tc.aleksandr_iablonskikh.hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CalculatorMultiplyTest {

    Calculator calculator = new Calculator();

    @Test(dataProvider = "")
    public void multiplyTest() {
        double actualResult = calculator.mult(2,2);
        assertThat(actualResult)
                .as("Multiplication results")
                .isEqualTo(4);
    }

}

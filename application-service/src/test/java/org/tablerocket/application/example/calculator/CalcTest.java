package org.tablerocket.application.example.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.tablerocket.example.calculator.api.Calculator;
import org.tablerocket.febo.testsupport.FeboExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(FeboExtension.class)
class CalcTest {

    @Test
    void testingTheCalculator(Calculator calculator) {
        assertEquals(5, calculator.sum(3,2));
    }
}

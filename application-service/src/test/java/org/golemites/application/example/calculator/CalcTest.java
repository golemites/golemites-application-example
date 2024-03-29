package org.golemites.application.example.calculator;

import org.golemites.api.FeboEntrypoint;
import org.golemites.example.calculator.api.Calculator;
import org.golemites.example.calculator.extra.Operator;
import org.golemites.testsupport.GolemitesExtension;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(GolemitesExtension.class)
class CalcTest {

    @Test
    void testingTheCalculator(Calculator calculator) {
        assertEquals(5, calculator.sum(3,2, Operator.EARTH));
    }

    @Disabled
    @Test
    void testEntrypoint(FeboEntrypoint command) {
        command.execute(new String[]{"1","2"},System.in,System.out,System.err);
    }
}

package org.golemites.example.calculator.internal;

import org.osgi.service.component.annotations.Component;
import org.golemites.example.calculator.api.Calculator;
import org.golemites.example.calculator.extra.Operator;

@Component
public class CalculatorImpl implements Calculator
{
    @Override public int sum( int a, int b, Operator op )
    {
        return a + b;
    }
}

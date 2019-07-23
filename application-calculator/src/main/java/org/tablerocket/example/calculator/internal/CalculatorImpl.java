package org.tablerocket.example.calculator.internal;

import org.osgi.service.component.annotations.Component;
import org.tablerocket.example.calculator.api.Calculator;
import org.tablerocket.example.calculator.extra.Operator;

@Component
public class CalculatorImpl implements Calculator
{
    @Override public int sum( int a, int b, Operator op )
    {
        return a + b;
    }
}

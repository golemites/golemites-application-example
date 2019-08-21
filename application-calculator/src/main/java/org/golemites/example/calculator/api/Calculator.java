package org.golemites.example.calculator.api;

import org.golemites.example.calculator.extra.Operator;

public interface Calculator
{
    int sum(int a, int b, Operator operator);
}

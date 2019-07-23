package org.tablerocket.example.calculator.api;

import org.tablerocket.example.calculator.extra.Operator;

public interface Calculator
{
    int sum(int a, int b, Operator operator);
}

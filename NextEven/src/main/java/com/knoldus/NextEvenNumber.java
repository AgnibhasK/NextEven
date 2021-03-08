package com.knoldus;

import java.util.function.IntUnaryOperator;

public class NextEvenNumber {
    public long calculate(long Number){

        IntUnaryOperator operator = num -> num + 2 - (num % 2);
        long result = operator.applyAsInt(Math.toIntExact(Number));
        return result;
    }
}
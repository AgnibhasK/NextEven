package com.knoldus;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class NextEvenNumberTest {
    @Test
    public void evenTest() {
        NextEvenNumber obj = new NextEvenNumber();
        Long val = obj.calculate(50000);
        Assertions.assertEquals(50002, val);
    }

    @Test
    public void oddTest() {
        NextEvenNumber obj = new NextEvenNumber();
        Long val = obj.calculate(50001);
        Assertions.assertEquals(50002, val);
    }
}
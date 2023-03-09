package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
    
    @Test
    public void betterAdd(){
        Calc calc = new Calc();
        int result = calc.add(2, 2);
        assertEquals(4, result);
    }

    @Test 
    public void betterSub(){
        Calc calc = new Calc();
        int result = calc.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test 
    public void betterSubWrong(){
        Calc calc = new Calc();
        int result = calc.subtract(10, 7);
        assertEquals(1, result);
    }
}

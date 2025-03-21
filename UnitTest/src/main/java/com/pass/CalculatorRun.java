package com.pass;

import com.unittest.Calculator;

public class CalculatorRun {
    public static void main(String[] args){
        Calculator jjk = new Calculator();

        int i1, i2;
        i1 = 2; i2 = 2;
        System.out.println("" + i1 + " + " + i2 + " = " + jjk.add(i1, i2));
        System.out.println("" + i1 + " / " + i2 + " = " + jjk.div(i1, i2));
        System.out.println("" + i1 + " - " + i2 + " = " + jjk.sub(i1, i2));
        System.out.println("" + i1 + " * " + i2 + " = " + jjk.mult(i1, i2));

    }
}

package com.unittest;

import jdk.jfr.Description;
import org.junit.jupiter.api.Tag;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    @Tag("calc")
    @Description("add")
    void add() {assertEquals(4, new Calculator().add(2, 2));
    }

    @org.junit.jupiter.api.Test
    @Tag("calc")
    @Description("div")
    void div() { assertEquals(1, new Calculator().div(2, 2));
    }

    @org.junit.jupiter.api.Test
    @Tag("calc")
    @Description("div by zero")
    void div_by_zero() { assertThrows(ArithmeticException.class, () -> new Calculator().div(2, 0));
    }

    @org.junit.jupiter.api.Test
    @Tag("calc")
    @Description("div_zero_by")
    void div_zero_by() { assertEquals(0, new Calculator().div(0, (int) ((Math.random() * (20 - 1)) + 1)));
    }

    @org.junit.jupiter.api.Test
    @Tag("calc")
    @Description("sub")
    void sub() { assertEquals(0, new Calculator().sub(2, 2));
    }

    @org.junit.jupiter.api.Test
    @Tag("calc")
    @Description("mult")
    void mult() {assertEquals(4, new Calculator().mult(2, 2));
    }
}
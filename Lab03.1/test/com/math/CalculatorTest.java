/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void testAdd() {
    Calculator calc = new Calculator();
    assertEquals(5, calc.add(1, 4));  // expected, actual
  }

  @Test
  public void testDivide() {
    Calculator calc = new Calculator();
    assertEquals(2.5, calc.divide(5,2), 0.001); // as long as actual value is within 2.499 - 2.511 it's good enough. (The tolerance)
  }

  @Test
  public void testIsEven() {
    Calculator calc = new Calculator();
    assertTrue(calc.isEven(10));
  }

}
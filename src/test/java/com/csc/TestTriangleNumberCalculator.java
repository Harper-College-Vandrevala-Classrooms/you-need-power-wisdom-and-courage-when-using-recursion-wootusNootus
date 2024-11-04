package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }

  // Testing known triangular numbers
  @Test
  public void testValue() {
    assertEquals(0, calculator.value(0));
    assertEquals(1, calculator.value(1));
    assertEquals(3, calculator.value(2));
    assertEquals(6, calculator.value(3));
    assertEquals(10, calculator.value(4));
    assertEquals(15, calculator.value(5));
  }

  // Test for the add function 
  @Test
  public void testAdd() {
      assertEquals(1, calculator.add(0, 1));
      assertEquals(4, calculator.add(1, 2));
      assertEquals(25, calculator.add(4, 5));
      assertEquals(9, calculator.add(3, 2));
  }

  // Test for the subtract function
  @Test
  public void testSubtract() {
      assertEquals(-2, calculator.subtract(1, 2));
      assertEquals(9, calculator.subtract(5, 3));
      assertEquals(55, calculator.subtract(10, 0));
      assertEquals(0, calculator.subtract(3, 3));
  }

  // Test for the multiply function
  @Test
  public void testMultiply() {
    assertEquals(0, calculator.multiply(0, 5));
    assertEquals(3, calculator.multiply(1, 2)); 
    assertEquals(90, calculator.multiply(3, 5)); 
    assertEquals(15, calculator.multiply(5, 1)); 
  }

  // Test for the divide function
  @Test
  public void testDivide() {
    assertEquals(1, calculator.divide(1, 1));
    assertEquals(5, calculator.divide(5, 2)); 
    assertEquals(7, calculator.divide(6, 2)); // 15 / 3

    // Test for divide by zero case
    assertThrows(ArithmeticException.class, () -> {
      calculator.divide(3, 0);
    });
  }
}

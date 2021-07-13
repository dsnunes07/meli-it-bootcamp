package meli.bootcamp.unittesting.testing.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTests {
  @Test
  void shouldAddTwoIntegers() {
    int a = 3;
    int b = 7;
    int expectedResult = a + b;

    int soma = Calculator.sum(a, b);

    assertEquals(soma, expectedResult);
  }
}

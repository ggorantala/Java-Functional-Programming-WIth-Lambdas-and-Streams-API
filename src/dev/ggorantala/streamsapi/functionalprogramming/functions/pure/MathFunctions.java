package src.dev.ggorantala.streamsapi.functionalprogramming.functions.pure;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

public class MathFunctions {
  private static final int VALUE_ONE = 2;
  private static final int VALUE_TWO = 3;

  public static void main(String[] args) {

    double result = mathOperation(VALUE_ONE, VALUE_TWO);
    System.out.println(result);
  }

  public static double mathOperation(int a, int b) {
    return Math.pow(a, b);
  }
}

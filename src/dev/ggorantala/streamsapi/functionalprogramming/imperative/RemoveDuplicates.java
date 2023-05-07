package src.dev.ggorantala.streamsapi.functionalprogramming.imperative;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
  private static final List<Integer> values = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7, 7, 8);

  public static void main(String[] args) {
    List<Integer> uniqueValues = new ArrayList<>();

    // in below, `value` variable is changed/updated for each iteration - "imperative way".
    for (int value : values) {
      if (!uniqueValues.contains(value)) {
        uniqueValues.add(value);
      }
    }
    System.out.println("Unique elements are: " + uniqueValues);
  }
}

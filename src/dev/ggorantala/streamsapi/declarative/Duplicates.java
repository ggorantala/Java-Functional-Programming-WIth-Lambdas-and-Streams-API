package src.dev.ggorantala.streamsapi.declarative;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import java.util.Arrays;
import java.util.List;

public class Duplicates {
  private static final List<Integer> values = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7, 7, 8);

  public static void main(String[] args) {
    List<Integer> uniqueValues =
        values // collections data
            .stream() // converting into Stream of integers
            .distinct()
            // .collect(Collectors.toList()); // or you can use `.toList();`
            .toList(); // or you can use `.toList();`

    System.out.println("Unique list : " + uniqueValues);
  }
}

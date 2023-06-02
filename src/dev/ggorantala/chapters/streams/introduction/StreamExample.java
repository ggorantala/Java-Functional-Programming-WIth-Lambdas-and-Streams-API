package src.dev.ggorantala.chapters.streams.introduction;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import java.util.stream.Stream;
import src.dev.ggorantala.Constants;

public class StreamExample {

  public static void main(String[] args) {
    Stream<String> fruits = Constants.FRUITS_LIST.stream();
    fruits.forEach(System.out::println);
  }
}
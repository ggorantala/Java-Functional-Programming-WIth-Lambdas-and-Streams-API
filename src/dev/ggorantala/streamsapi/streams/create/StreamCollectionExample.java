package src.dev.ggorantala.streamsapi.streams.create;
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
import src.dev.ggorantala.constants.Constants;

public class StreamCollectionExample {
  public static void main(String[] args) {

    Stream<String> stream = Constants.STRING_LIST.stream();

    // Perform operations on the stream
    stream.forEach(System.out::println);
  }
}
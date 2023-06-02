package src.dev.ggorantala.chapters.functionalinterfaces.exercises.problemone;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import java.util.function.Consumer;
import src.dev.ggorantala.Constants;

class Solution {
  public static void main(String[] args) {
    Consumer<String> fruitsConsumer = new ConsumerImpl();
    Constants.FRUITS_LIST.forEach(fruitsConsumer);
  }
}
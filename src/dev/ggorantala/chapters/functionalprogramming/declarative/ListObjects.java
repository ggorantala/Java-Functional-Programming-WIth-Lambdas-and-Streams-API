package src.dev.ggorantala.chapters.functionalprogramming.declarative;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import java.util.List;
import src.dev.ggorantala.model.Book;

public class ListObjects {
  public static void main(String[] args) {
    List<Book> declarativeApproach =
        Book.BOOKS.stream()
            .filter(book -> book.costInEuros() >= 5)
            // .collect(Collectors.toList());
            .toList();

    declarativeApproach.forEach(System.out::println);
  }
}

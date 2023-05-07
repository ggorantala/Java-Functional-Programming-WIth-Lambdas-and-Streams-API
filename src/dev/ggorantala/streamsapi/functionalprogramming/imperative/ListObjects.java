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

import java.util.List;
import src.dev.ggorantala.streamsapi.model.Book;

public class ListObjects {
  public static void main(String[] args) {
    List<Book> imperativeApproach = Book.BOOKS;

    for (Book book : imperativeApproach) {
      if (book.costInEuros() >= 5) {
        System.out.println(book);
      }
    }
  }
}

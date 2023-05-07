package src.dev.ggorantala.streamsapi.functionalprogramming.interfaces;
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

public interface NormalInterfaceService {
  void addBook(Book book);

  void deleteBook(Long bookId);

  void updateBook(Long bookId, Book book);

  void deleteBooksByAuthor(String author);

  List<Book> getAllBooks();

  Book findBookById(Long bookId);
}

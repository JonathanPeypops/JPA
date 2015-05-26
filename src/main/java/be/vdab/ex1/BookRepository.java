package be.vdab.ex1;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
}

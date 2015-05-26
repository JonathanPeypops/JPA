import be.vdab.Book;
import be.vdab.BookRepository;
import be.vdab.BookRepositoryBean;

import javax.persistence.EntityManager;
import java.util.List;

public class Tester {
    private EntityManager em;

    public void testOurLogic() {
        BookRepository bookRepository = new BookRepositoryBean(em);
        List<Book> books = bookRepository.findAllBooks();
        assertEquals(2, books.size());

    }
}
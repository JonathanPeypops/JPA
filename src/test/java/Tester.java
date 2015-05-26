import be.vdab.Book;
import be.vdab.BookRepository;
import be.vdab.BookRepositoryBean;
import org.junit.Test;

import javax.persistence.EntityManager;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class Tester {
    private EntityManager em;

    @Test
    public void testOurLogic() {
        BookRepository bookRepository = new BookRepositoryBean(em);
        List<Book> books = bookRepository.findAllBooks();
        assertEquals(2, books.size());

    }
}
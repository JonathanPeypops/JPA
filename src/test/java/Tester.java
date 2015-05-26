import be.vdab.Book;
import be.vdab.BookRepository;
import be.vdab.BookRepositoryBean;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class Tester {

    @Test
    public void testOurLogic() {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("RealDolmenPersistenceUnit");
        EntityManager em =
                entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.getTransaction().commit();


        BookRepository bookRepository = new BookRepositoryBean(em);
        List<Book> books = bookRepository.findAllBooks();
        assertEquals(5, books.size());

        em.close();
        entityManagerFactory.close();
    }
}
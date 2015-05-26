import be.vdab.Book;
import be.vdab.BookRepository;
import be.vdab.BookRepositoryBean;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class Tester {
    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;

    @BeforeClass
    public void initializeEMF() {
        entityManagerFactory = Persistence.createEntityManagerFactory("Books");
    }

    @AfterClass
    public void destroyEMF() {
        entityManagerFactory.close();
    }

    @Before
    public void initializeEM() {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    @After
    public void destroyEM() {
        entityManager.getTransaction().begin();
        entityManager.getTransaction().commit();
    }

    private Logger logger = LoggerFactory.getLogger(Tester.class);

    @Test
    public void testOurLogic() {
        logger.debug("Hellow to YOU");
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


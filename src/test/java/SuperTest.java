import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by jeansmits on 26/05/15.
 */
public class SuperTest {
    protected static EntityManager entityManager;
    protected static EntityManagerFactory entityManagerFactory;
    protected Logger logger = LoggerFactory.getLogger(Tester.class);

    @BeforeClass
    public static void initializeEMF() {
        entityManagerFactory = Persistence.createEntityManagerFactory("RealDolmenPersistenceUnit");
    }

    @AfterClass
    public static void destroyEMF() {
        entityManagerFactory.close();
    }

    @Before
    public void initializeEM() {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    @After
    public void destroyEM() {
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}

package be.vdab.ex1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Launcher {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("RealDolmenPersistenceUnit");
        EntityManager entityManager =
                entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }
}

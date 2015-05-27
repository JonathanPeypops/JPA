import be.vdab.ex1.Book;
import be.vdab.ex4.Passenger;
import be.vdab.ex4.PassengerType;
import be.vdab.extra_ex.Actor;
import be.vdab.extra_ex.Gender;
import org.junit.*;

import java.util.Date;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class Tester extends SuperTest {

    @Test
    public void testOurLogic() {
        List<Book> books = entityManager.createQuery("select b from Book b", Book.class).getResultList();
        assertEquals("Iron Man", books.get(4).getTitle());
    }

    @Test
    public void extraTestOurLogic() {
        List<Book> books = entityManager.createQuery("select b from Book b", Book.class).getResultList();
        assertEquals(5, books.size());
    }

    @Test
    public void passengerTest() {
        Passenger p = new Passenger("Jonathan","Peypops", PassengerType.AWESOME,null);
        entityManager.persist(p);
        assertNotNull(p.getId());
        assertEquals(p.getFirstname(),"Jonathan");
        assertEquals(p.getLastname(),"Peypops");
        assertEquals(p.getType(),PassengerType.AWESOME);
    }

    @Test
    public void actorFullNameTest() {
        Actor bruce = new Actor("Bruce","Wayne", Gender.MALE);
        assertEquals("Bruce Wayne", bruce.fullName());
    }

    @Test
    public void actorSave() {
        Actor clark = new Actor ("Kal","El",Gender.MALE);

    }
}
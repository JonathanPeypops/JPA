import be.vdab.ex1.Book;
import be.vdab.ex4.Passenger;
import be.vdab.ex4.PassengerType;
import org.junit.*;

import java.util.Date;
import java.util.List;

import static junit.framework.Assert.assertEquals;

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
        Passenger p = new Passenger("Jonathan","Peypops", PassengerType.AWESOME);
        entityManager.persist(p);
        assertEquals(p.getFirstname(),"Jonathan");
        assertEquals(p.getId(),1);
    }
}


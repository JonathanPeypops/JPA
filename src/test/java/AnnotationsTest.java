import be.vdab.ex_annotations.*;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AnnotationsTest extends SuperTest {
    @Test
    public void filmtest(){
        Film f = entityManager.find(Film.class,1);
        f.getActors();
        f.getDirector();
    }
    @Test
    public void actortest(){
       FilmActor a = entityManager.find(FilmActor.class, 1);
        a.getFilms();
        Film f = new Film ("Cars");
        entityManager.persist(f);
        assertNotNull(f.getId());
        a.addFilm(f);
    }
}

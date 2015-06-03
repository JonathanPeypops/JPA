import be.vdab.ex_annotations.*;
import org.junit.Test;

public class AnnotationsTest extends SuperTest {
    @Test
    public void filmtest(){
        Film f = entityManager.find(Film.class,1);
        f.getActors();
        f.getDirector();
    }
}

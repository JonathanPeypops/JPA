package be.vdab.ex_annotations;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
public class FilmActor {
    @Id
    @GeneratedValue
    private int id;
    private String firstname;
    private String lastname;
    @ManyToMany(mappedBy = "actors")
    private List<Film> films= new ArrayList<>();

    public FilmActor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Film> getFilms() {
        return films;
    }
    public FilmActor(){

    }

    public void addFilm(Film film){
        films.add(film);
        film.getActors().add(this);

    }
}

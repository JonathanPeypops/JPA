package be.vdab.ex_annotations;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.ManyToMany;
import java.util.List;

public class Actor {
    private int id;
    private String firstname;
    private String lastname;
    @ManyToMany
    private List<Film> films;

    public Actor(int id, String firstname, String lastname) {
        this.id = id;
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
    public Actor(){

    }
}

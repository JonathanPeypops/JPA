package be.vdab.ex_annotations;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

public class Director {
    private int id;
    private String name;
    @OneToMany
    private List<Film> films;

    public Director(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilms() {
        return films;
    }
    public Director(){

    }
}

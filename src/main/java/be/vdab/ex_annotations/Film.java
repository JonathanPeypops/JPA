package be.vdab.ex_annotations;

import javax.persistence.*;
import java.util.List;
@Entity
public class Film {

    public Film(String title) {
        this.title = title;
    }

    @Id
    @GeneratedValue
    private int id;
    private String title;
    @ManyToOne
    private Director director;
    @ManyToMany
    private List<Actor> actors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActors() {
        return actors;
    }
    public Film(){

    }
}

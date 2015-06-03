package be.vdab.ex_annotations;

import javax.persistence.*;
import java.util.ArrayList;
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
    private List<FilmActor> actors = new ArrayList<>();

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

    public void setDirector(Director director) {
        this.director = director;
    }

    public Director getDirector() {
        return director;
    }

    public void setActors(List<FilmActor> actors) {
        this.actors = actors;

    }

    public List<FilmActor> getActors() {
        return actors;

    }

    public void addActor(FilmActor factor){
        actors.add(factor);
        factor.addFilm(this);
    }

    public Film(){

    }
}

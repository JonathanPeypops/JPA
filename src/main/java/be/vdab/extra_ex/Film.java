package be.vdab.extra_ex;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Film {
    private Integer id;
    private String title;
    private double length;
    @Enumerated(EnumType.STRING)
    private Genre genre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

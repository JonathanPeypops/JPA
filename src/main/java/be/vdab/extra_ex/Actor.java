package be.vdab.extra_ex;

public class Actor {
    private Integer id;
    private String firstname;
    private String lastname;
    private Gender gender;

    public Actor(String firstname, String lastname, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
    }

    public String fullName() {
        return firstname + " " + lastname;
    }
}

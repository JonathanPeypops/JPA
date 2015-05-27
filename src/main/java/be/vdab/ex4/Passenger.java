package be.vdab.ex4;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private byte[] picture;

    private String firstname;

    private String lastname;

    @Temporal(TemporalType.DATE)
    @Access(AccessType.PROPERTY)
    private Date DOB;

    private int age;

    @Enumerated(EnumType.STRING)
    private PassengerType type;

    public Passenger(String firstname, String lastname, PassengerType type,Date DOB) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.type = type;
        setDOB(DOB);

    }

    public Passenger() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
        assignAge(DOB);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PassengerType getType() {
        return type;
    }

    public void setType(PassengerType type) {
        this.type = type;
    }

    private void assignAge(Date dateOfBirth) {
        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);
        this.age = Calendar.getInstance().get(Calendar.YEAR) - dob.get(Calendar.YEAR);
    }
}

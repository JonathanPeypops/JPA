package be.vdab.ex4;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Passengers")
@SecondaryTables(value = {
        @SecondaryTable(name = "FFM"),
        @SecondaryTable(name = "Picture")
})

public class Passenger {
    @Id
    @GeneratedValue
    private int id;

    private int FFM;

    @Column(name = "Picture")
    private byte[] picture;

    @Column(name = "first", nullable = false)
    private String firstname;

    @Column(name = "last", nullable = false)
    private String lastname;

    @Column(name = "DOB",nullable = false)
    private Date DOB;

    private int age;

    @Enumerated(EnumType.STRING)
    private PassengerType type;

    public Passenger() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFFM() {
        return FFM;
    }

    public void setFFM(int FFM) {
        this.FFM = FFM;
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
}

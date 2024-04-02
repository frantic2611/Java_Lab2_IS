package Entities;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

@Entity
@Table(name = "cats", schema = "public")
public class Cat {
    private String name;
    @Column(name = "birth")
    private LocalDate dateOfBirth;
    private String breed;
    private String color;
    private int ownerID;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catid", nullable = false)
    private int catid;

    public Cat() {
    }

    public Cat(String name, LocalDate dateOfBirth, String breed, String color, int owner)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.breed= breed;
        this.color = color;
        this.ownerID = owner;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getCatID()
    {
        return catid;
    }
    public void setCatID(int id)
    {
        this.catid = id;
    }
}

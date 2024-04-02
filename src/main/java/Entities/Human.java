package Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "humans", schema = "public")
public class Human {
    private String name;
    @Column(name = "birth")
    private LocalDate dateOfBirth;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "humanid", nullable = false)
    private int humanId;
    public Human() {
    }

    public Human(String name, LocalDate dateOfBirth)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public int getHumanId() {
        return humanId;
    }

    public void setHumanId(int humanid) {
        this.humanId = humanid;
    }
}

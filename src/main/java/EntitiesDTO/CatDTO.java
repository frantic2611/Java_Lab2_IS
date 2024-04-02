package EntitiesDTO;

import java.time.LocalDate;

public class CatDTO {
    private String name;
    private LocalDate dateOfBirth;
    private String breed;
    private String color;
    private int ownerID;
    private int catId;

    public CatDTO() {
    }

    public CatDTO(String name, LocalDate dateOfBirth, String breed, String color, int owner)
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

    public int getCatID() {
        return catId;
    }
    public void setCatID(int id) {
        this.catId = id;
    }
}

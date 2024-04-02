package Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "friends", schema = "public")
public class Friendship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfriendship", nullable = false)
    private int friendshipID;
    @Column(name = "firstcatid")
    private int fristCatID;
    @Column(name = "secondcatid")

    private int secindCatID;

    public Friendship(int fristCatID, int secindCatID) {
        this.fristCatID = fristCatID;
        this.secindCatID = secindCatID;
    }

    public int getFristCatID() {
        return fristCatID;
    }

    public void setFristCatID(int fristCatID) {
        this.fristCatID = fristCatID;
    }

    public int getSecindCatID() {
        return secindCatID;
    }

    public void setSecindCatID(int secindCatID) {
        this.secindCatID = secindCatID;
    }

    public int getFriendshipID() {
        return friendshipID;
    }

    public void setFriendshipID(int friendshipID) {
        this.friendshipID = friendshipID;
    }
}

package org.example;

import DAO.CatDAO;
import DAO.HumanDAO;
import Entities.Cat;
import Entities.Human;

import java.sql.SQLException;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CatDAO catDAO = new CatDAO();
        HumanDAO humanDAO = new HumanDAO();
        Human human = new Human("Rashid", LocalDate.of(2004, 1, 19));
        Cat cat = new Cat("барсук", LocalDate.of(2004, 1, 19),"легенда", "рыжий черт", 2281337);
        catDAO.delete(8);
    }
}


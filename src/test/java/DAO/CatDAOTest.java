package DAO;

import Entities.Cat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import java.sql.SQLException;
import java.time.LocalDate;


@ExtendWith(MockitoExtension.class)
class CatDAOTest {

    @Test
    void addCat()  {

        CatDAO catDAO = Mockito.mock(CatDAO.class);
        var cat = new Cat("бар", LocalDate.of(2004, 1, 19),"легенда", "рыжий черт", 2281337);
        catDAO.add(cat);
        Mockito.verify(catDAO).add(cat);
    }

    @Test
    void deleteCat() {

        CatDAO catDAO = Mockito.mock(CatDAO.class);
        var cat = new Cat("бар", LocalDate.of(2004, 1, 19),"легенда", "рыжий черт", 2281337);
        catDAO.delete(cat.getCatID());
        Mockito.verify(catDAO).delete(cat.getCatID());
    }

    @Test
    void updateCat() throws SQLException {

        CatDAO catDAO = Mockito.mock(CatDAO.class);
        var cat = new Cat("бар", LocalDate.of(2004, 1, 19),"легенда", "рыжий черт", 2281337);
        catDAO.update(cat);
        Mockito.verify(catDAO).update(cat);
    }
}
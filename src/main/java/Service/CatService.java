package Service;

import DAO.CatDAO;
import Entities.Cat;

import java.sql.SQLException;

public class CatService implements IService<Cat>{
    private CatDAO catDAO;

    public CatService(CatDAO catDAO) {
        this.catDAO = catDAO;
    }
    public void add(Cat cat) {
        catDAO.add(cat);
    }

    public void delete(int catid) {
        catDAO.delete(catid);
    }

    public void update(Cat cat) {
        catDAO.update(cat);
    }

    public Cat getByID(int id) {
        return catDAO.getObjectByID(id);
    }
}

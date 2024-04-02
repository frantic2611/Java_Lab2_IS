package Service;

import DAO.HumanDAO;
import Entities.Human;

import java.sql.SQLException;

public class HumanService implements IService<Human>{
    private HumanDAO humanDAO;

    public HumanService(HumanDAO humanDAO) {
        this.humanDAO = humanDAO;
    }

    public void add(Human human) {
        humanDAO.add(human);
    }
    public void delete(int humanid) { humanDAO.delete(humanid);}
    public void update(Human human) { humanDAO.update(human);}
    public Human getByID(int id) { return humanDAO.getObjectByID(id);}
}

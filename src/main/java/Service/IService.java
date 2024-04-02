package Service;

import java.sql.SQLException;

public interface IService<T> {
    void add(T obj) throws SQLException;
    void delete(int objID);
    void update(T obj);
    T getByID(int id);
}

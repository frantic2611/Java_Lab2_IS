package DAO;

public interface DAO<T>{
    void add(T object);
    void delete(int objectId);
    void update(T object);
    T getObjectByID(int id);
}

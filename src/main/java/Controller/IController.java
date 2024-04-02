package Controller;

public interface IController <T> {
    public void add(T obj);
    public void delete(T obj);
    public void update(T obj);
    public T find(T obj);


}

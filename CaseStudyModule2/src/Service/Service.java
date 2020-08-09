package Service;

public interface Service<E> {
    void add(E e);
    void update(E e);
    void getAll();
    void remove(int id);
    void search(int id);
}

package Inheritance.personManager.management;

public interface PersonManager<E> {
    void add(E e);

    void delete(int id);

    void edit(int id, E e);

    E findById(int id);

    int findIndexById(int id);

    E[] showAll();
}

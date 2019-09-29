package by.bsuir.devteam.entity.crud;

import java.util.Optional;

public interface CRUD<T> {

    void add (T entity);

    Optional<T> getById(int id);

    Optional<T> getByName(String name);

    void update(int id , T entity);

    void delete(T entity);

    void deleteById(int id);
}
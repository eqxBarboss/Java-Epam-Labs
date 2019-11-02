package by.bsuir.devteam.dao;

import by.bsuir.devteam.entity.employee.Tester;

import java.util.List;
import java.util.Optional;

public interface TesterDAO {
    List<Tester> getAll();
    void add (Tester businessAnalyst);
    Optional<Tester> get(int id);
    Optional<Tester> getByName(String name);
    void update(int id, Tester businessAnalyst);
    void delete(Tester businessAnalyst);
    void deleteById(int id);
}

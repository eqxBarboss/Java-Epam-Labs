package by.bsuir.devteam.dao;

import by.bsuir.devteam.entity.employee.Developer;

import java.util.List;
import java.util.Optional;

public interface DeveloperDAO{
    List<Developer> getAll();
    void add (Developer developer);
    Optional<Developer> get(int id);
    Optional<Developer> getByName(String name);
    void update(int id, Developer developer);
    void delete(Developer developer);
    void deleteById(int id);
}

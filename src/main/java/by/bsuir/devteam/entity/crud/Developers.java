package by.bsuir.devteam.entity.crud;

import by.bsuir.devteam.entity.employee.Developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Developers implements CRUD<Developer>, java.io.Serializable{

    private List<Developer> developers;

    public Developers() {
        this.developers = new ArrayList<Developer>();
    }

    @Override
    public List<Developer> get() {
        return developers;
    }

    @Override
    public void add(Developer entity) {
        this.developers.add(entity);
    }

    @Override
    public Optional<Developer> getById(int id) {
        return this.developers.stream()
                .filter(d -> d.getId() == id)
                .findFirst();
    }

    @Override
    public Optional<Developer> getByName(String name) {
        return this.developers.stream()
                .filter(d -> d.getName().equals(name))
                .findFirst();
    }

    @Override
    public void update(int id, Developer entity) {
        this.developers = this.developers.stream().
                map(d -> (d.getId() == id) ? entity : d).
                collect(Collectors.toList());
    }

    @Override
    public void delete(Developer entity) {
        this.developers.removeIf(d -> d.equals(entity));
    }

    @Override
    public void deleteById(int id) {
        this.developers.removeIf(d -> d.getId() == id);
    }
}

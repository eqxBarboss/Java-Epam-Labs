package by.bsuir.devteam.entity.crud;

import by.bsuir.devteam.entity.employee.Tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Testers implements CRUD<Tester>, java.io.Serializable{

    private List<Tester> testers;

    public Testers() {
        this.testers = new ArrayList<Tester>();
    }

    @Override
    public List<Tester> get() {
        return testers;
    }

    @Override
    public void add(Tester entity) {
        this.testers.add(entity);
    }

    @Override
    public Optional<Tester> getById(int id) {
        return this.testers.stream()
                .filter(d -> d.getId() == id)
                .findFirst();
    }

    @Override
    public Optional<Tester> getByName(String name) {
        return this.testers.stream()
                .filter(d -> d.getName().equals(name))
                .findFirst();
    }

    @Override
    public void update(int id, Tester entity) {
        this.testers = this.testers.stream().
                map(d -> (d.getId() == id) ? entity : d).
                collect(Collectors.toList());
    }

    @Override
    public void delete(Tester entity) {
        this.testers.removeIf(d -> d.equals(entity));
    }

    @Override
    public void deleteById(int id) {
        this.testers.removeIf(d -> d.getId() == id);
    }
}

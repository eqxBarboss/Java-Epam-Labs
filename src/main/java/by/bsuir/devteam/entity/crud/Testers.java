package by.bsuir.devteam.entity.crud;

import by.bsuir.devteam.entity.Entity;
import by.bsuir.devteam.entity.employee.Tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Testers implements CRUD<Tester>, java.io.Serializable{

    private List<Tester> testers;
    private int maxId;

    public void setTesters(List<Tester> testers) {
        this.testers = testers;
    }

    public List<Tester> getTesters() {
        return testers;
    }

    public Testers() {
        this.testers = new ArrayList<Tester>();
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

    @Override
    public int getMaxId(){
        return this.maxId;
    }

    @Override
    public void updateMaxId() {
        this.maxId = testers
                .stream()
                .mapToInt(Entity::getId)
                .max().orElse(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Testers testers1 = (Testers) o;
        return Objects.equals(testers, testers1.testers);
    }

    @Override
    public int hashCode() {

        return Objects.hash(testers);
    }

    @Override
    public String toString() {
        return testers.stream()
                .map(Tester::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }
}

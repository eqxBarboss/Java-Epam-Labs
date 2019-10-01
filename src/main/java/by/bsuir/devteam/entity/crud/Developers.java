package by.bsuir.devteam.entity.crud;

import by.bsuir.devteam.entity.Entity;
import by.bsuir.devteam.entity.employee.Developer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Developers implements CRUD<Developer>, java.io.Serializable{

    private List<Developer> developers;
    private int maxId;

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public Developers() {
        this.developers = new ArrayList<Developer>();
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

    @Override
    public int getMaxId(){
        return this.maxId;
    }

    @Override
    public void updateMaxId() {
        this.maxId = developers
                .stream()
                .mapToInt(Entity::getId)
                .max().orElse(0);
    }

    @Override
    public String toString() {
        return developers.stream()
                .map(Developer::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developers that = (Developers) o;
        return Objects.equals(developers, that.developers);
    }

    @Override
    public int hashCode() {

        return Objects.hash(developers);
    }
}

package by.bsuir.devteam.dao.impl;

import by.bsuir.devteam.dao.DeveloperDAO;
import by.bsuir.devteam.entity.employee.Developer;
import by.bsuir.devteam.singleton.SingletonTeam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TeamDeveloperDAO implements DeveloperDAO {

    @Override
    public List<Developer> getAll() {
        List<Developer> developers = SingletonTeam.getInstance().getDevelopers();
        return developers;
    }

    @Override
    public void add(Developer developer) {
        List<Developer> developers = SingletonTeam.getInstance().getDevelopers();
        developers.add(developer);
    }

    @Override
    public Optional<Developer> get(int id) {
        List<Developer> developers = SingletonTeam.getInstance().getDevelopers();
        return developers.stream()
                .filter(d -> d.getId() == id)
                .findFirst();
    }

    @Override
    public Optional<Developer> getByName(String name) {
        List<Developer> developers = SingletonTeam.getInstance().getDevelopers();
        return developers.stream()
                .filter(d -> d.getName().equals(name))
                .findFirst();
    }

    @Override
    public void update(int id, Developer developer) {
        List<Developer> developers = SingletonTeam.getInstance().getDevelopers();
        developers = developers.stream().
                map(d -> (d.getId() == id) ? developer : d).
                collect(Collectors.toList());
    }

    @Override
    public void delete(Developer developer) {
        List<Developer> developers = SingletonTeam.getInstance().getDevelopers();
        developers.removeIf(d -> d.equals(developer));
    }

    @Override
    public void deleteById(int id) {
        List<Developer> developers = SingletonTeam.getInstance().getDevelopers();
        developers.removeIf(d -> d.getId() == id);
    }
}

package by.bsuir.devteam.dao.impl;

import by.bsuir.devteam.dao.TesterDAO;
import by.bsuir.devteam.entity.employee.Tester;
import by.bsuir.devteam.singleton.SingletonTeam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TeamTesterDAO implements TesterDAO{

    @Override
    public List<Tester> getAll() {
        List<Tester> testers = SingletonTeam.getInstance().getTesters();
        return testers;
    }

    @Override
    public void add(Tester tester) {
        List<Tester> testers = SingletonTeam.getInstance().getTesters();
        testers.add(tester);
    }

    @Override
    public Optional<Tester> get(int id) {
        List<Tester> testers = SingletonTeam.getInstance().getTesters();
        return testers.stream()
                .filter(d -> d.getId() == id)
                .findFirst();
    }

    @Override
    public Optional<Tester> getByName(String name) {
        List<Tester> testers = SingletonTeam.getInstance().getTesters();
        return testers.stream()
                .filter(d -> d.getName().equals(name))
                .findFirst();
    }

    @Override
    public void update(int id, Tester tester) {
        List<Tester> testers = SingletonTeam.getInstance().getTesters();
        testers = testers.stream().
                map(d -> (d.getId() == id) ? tester : d).
                collect(Collectors.toList());
    }

    @Override
    public void delete(Tester tester) {
        List<Tester> testers = SingletonTeam.getInstance().getTesters();
        testers.removeIf(d -> d.equals(tester));
    }

    @Override
    public void deleteById(int id) {
        List<Tester> testers = SingletonTeam.getInstance().getTesters();
        testers.removeIf(d -> d.getId() == id);
    }
}

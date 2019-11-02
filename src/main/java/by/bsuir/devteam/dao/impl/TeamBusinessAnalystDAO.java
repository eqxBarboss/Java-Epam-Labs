package by.bsuir.devteam.dao.impl;

import by.bsuir.devteam.dao.BusinessAnalystDAO;
import by.bsuir.devteam.entity.employee.BusinessAnalyst;
import by.bsuir.devteam.singleton.SingletonTeam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TeamBusinessAnalystDAO implements BusinessAnalystDAO {

    @Override
    public List<BusinessAnalyst> getAll() {
        List<BusinessAnalyst> businessAnalysts = SingletonTeam.getInstance().getBusinessAnalysts();
        return businessAnalysts;
    }

    @Override
    public void add(BusinessAnalyst businessAnalyst) {
        List<BusinessAnalyst> businessAnalysts = SingletonTeam.getInstance().getBusinessAnalysts();
        businessAnalysts.add(businessAnalyst);
    }

    @Override
    public Optional<BusinessAnalyst> get(int id) {
        List<BusinessAnalyst> businessAnalysts = SingletonTeam.getInstance().getBusinessAnalysts();
        return businessAnalysts.stream()
                .filter(d -> d.getId() == id)
                .findFirst();
    }

    @Override
    public Optional<BusinessAnalyst> getByName(String name) {
        List<BusinessAnalyst> businessAnalysts = SingletonTeam.getInstance().getBusinessAnalysts();
        return businessAnalysts.stream()
                .filter(d -> d.getName().equals(name))
                .findFirst();
    }

    @Override
    public void update(int id, BusinessAnalyst businessAnalyst) {
        List<BusinessAnalyst> businessAnalysts = SingletonTeam.getInstance().getBusinessAnalysts();
        businessAnalysts = businessAnalysts.stream().
                map(d -> (d.getId() == id) ? businessAnalyst : d).
                collect(Collectors.toList());
    }

    @Override
    public void delete(BusinessAnalyst businessAnalyst) {
        List<BusinessAnalyst> businessAnalysts = SingletonTeam.getInstance().getBusinessAnalysts();
        businessAnalysts.removeIf(d -> d.equals(businessAnalyst));
    }

    @Override
    public void deleteById(int id) {
        List<BusinessAnalyst> businessAnalysts = SingletonTeam.getInstance().getBusinessAnalysts();
        businessAnalysts.removeIf(d -> d.getId() == id);
    }
}

package by.bsuir.devteam.entity.crud;

import by.bsuir.devteam.entity.employee.BusinessAnalyst;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BusinessAnalysts implements CRUD<BusinessAnalyst>, java.io.Serializable{

    private List<BusinessAnalyst> businessAnalysts;

    public BusinessAnalysts() {
        this.businessAnalysts = new ArrayList<BusinessAnalyst>();
    }

    @Override
    public List<BusinessAnalyst> get() {
        return businessAnalysts;
    }

    @Override
    public void add(BusinessAnalyst entity) {
        this.businessAnalysts.add(entity);
    }

    @Override
    public Optional<BusinessAnalyst> getById(int id) {
        return this.businessAnalysts.stream()
                .filter(d -> d.getId() == id)
                .findFirst();
    }

    @Override
    public Optional<BusinessAnalyst> getByName(String name) {
        return this.businessAnalysts.stream()
                .filter(d -> d.getName().equals(name))
                .findFirst();
    }

    @Override
    public void update(int id, BusinessAnalyst entity) {
        this.businessAnalysts = this.businessAnalysts.stream().
                map(d -> (d.getId() == id) ? entity : d).
                collect(Collectors.toList());
    }

    @Override
    public void delete(BusinessAnalyst entity) {
        this.businessAnalysts.removeIf(d -> d.equals(entity));
    }

    @Override
    public void deleteById(int id) {
        this.businessAnalysts.removeIf(d -> d.getId() == id);
    }
}

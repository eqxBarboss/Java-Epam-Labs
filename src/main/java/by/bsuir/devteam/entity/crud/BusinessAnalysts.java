package by.bsuir.devteam.entity.crud;

import by.bsuir.devteam.entity.Entity;
import by.bsuir.devteam.entity.employee.BusinessAnalyst;
import by.bsuir.devteam.entity.employee.EmployeeIdComparator;

import java.util.*;
import java.util.stream.Collectors;

public class BusinessAnalysts implements CRUD<BusinessAnalyst>, java.io.Serializable{

    private List<BusinessAnalyst> businessAnalysts;
    private int maxId;

    public void setBusinessAnalysts(List<BusinessAnalyst> businessAnalysts) {
        this.businessAnalysts = businessAnalysts;
    }

    public List<BusinessAnalyst> getBusinessAnalysts() {
        return businessAnalysts;
    }

    public BusinessAnalysts() {
        this.businessAnalysts = new ArrayList<BusinessAnalyst>();
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

    @Override
    public int getMaxId(){
        return this.maxId;
    }

    @Override
    public void updateMaxId() {
        this.maxId = businessAnalysts
                .stream()
                .mapToInt(Entity::getId)
                .max().orElse(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinessAnalysts that = (BusinessAnalysts) o;
        return Objects.equals(businessAnalysts, that.businessAnalysts);
    }

    @Override
    public int hashCode() {

        return Objects.hash(businessAnalysts);
    }

    public String toStringSortedById(){

        businessAnalysts.sort(new EmployeeIdComparator());
        return this.toString();
    }

    public String toStringSortedByFullName(){

        Collections.sort(businessAnalysts);
        return this.toString();
    }

    @Override
    public String toString() {
        return businessAnalysts.stream()
                .map(BusinessAnalyst::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }
}

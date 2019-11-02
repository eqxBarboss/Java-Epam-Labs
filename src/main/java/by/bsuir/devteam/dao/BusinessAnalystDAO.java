package by.bsuir.devteam.dao;

import by.bsuir.devteam.entity.employee.BusinessAnalyst;

import java.util.List;
import java.util.Optional;

public interface BusinessAnalystDAO{
    List<BusinessAnalyst> getAll();
    void add (BusinessAnalyst businessAnalyst);
    Optional<BusinessAnalyst> get(int id);
    Optional<BusinessAnalyst> getByName(String name);
    void update(int id, BusinessAnalyst businessAnalyst);
    void delete(BusinessAnalyst businessAnalyst);
    void deleteById(int id);
}

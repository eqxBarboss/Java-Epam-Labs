package by.bsuir.devteam.service;

import by.bsuir.devteam.dao.BusinessAnalystDAO;
import by.bsuir.devteam.dao.factory.DAOFactory;
import by.bsuir.devteam.entity.employee.BusinessAnalyst;
import by.bsuir.devteam.entity.employee.EmployeeIdComparator;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class BusinessAnalystService {
    private BusinessAnalystDAO businessAnalystDAO = DAOFactory.getInstance().getBusinessAnalystDAO();

    public void hireBusinessAnalyst(BusinessAnalyst businessAnalyst){
        businessAnalystDAO.add(businessAnalyst);
    }

    public void fireBusinessAnalystById(int id){
        businessAnalystDAO.deleteById(id);
    }

    public Optional<BusinessAnalyst> getBusinessAnalystById(int id){
        return businessAnalystDAO.get(id);
    }

    public void updateBusinessAnalystDataById(int id, BusinessAnalyst businessAnalyst){
        businessAnalystDAO.update(id, businessAnalyst);
    }

    public String getAllBusinessAnalysts(){
        return businessAnalystDAO.getAll().toString();
    }

    public String getAllBusinessAnalystsSortedByFullName() {
        List<BusinessAnalyst> businessAnalysts = businessAnalystDAO.getAll();
        Collections.sort(businessAnalysts);
        return businessAnalysts.toString();
    }

    public String getAllBusinessAnalystsSortedById() {
        List<BusinessAnalyst> businessAnalysts = businessAnalystDAO.getAll();
        businessAnalysts.sort(new EmployeeIdComparator());
        return businessAnalysts.toString();
    }
}

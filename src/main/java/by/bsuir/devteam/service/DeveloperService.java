package by.bsuir.devteam.service;

import by.bsuir.devteam.dao.DeveloperDAO;
import by.bsuir.devteam.dao.factory.DAOFactory;
import by.bsuir.devteam.entity.employee.Developer;
import by.bsuir.devteam.entity.employee.EmployeeIdComparator;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DeveloperService {

    private DeveloperDAO developerDAO = DAOFactory.getInstance().getDeveloperDAO();

    public void hireDeveloper(Developer developer){
        developerDAO.add(developer);
    }

    public void fireDeveloperById(int id){
        developerDAO.deleteById(id);
    }

    public Optional<Developer> getDeveloperById(int id){
        return developerDAO.get(id);
    }

    public void updateDeveloperDataById(int id, Developer developer){
        developerDAO.update(id, developer);
    }

    public String getAllDevelopers(){
        return developerDAO.getAll().toString();
    }

    public String getAllDevelopersSortedByFullName() {
        List<Developer> developers = developerDAO.getAll();
        Collections.sort(developers);
        return developers.toString();
    }

    public String getAllDevelopersSortedById() {
        List<Developer> developers = developerDAO.getAll();
        developers.sort(new EmployeeIdComparator());
        return developers.toString();
    }
}

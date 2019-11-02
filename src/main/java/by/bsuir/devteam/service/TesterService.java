package by.bsuir.devteam.service;

import by.bsuir.devteam.dao.TesterDAO;
import by.bsuir.devteam.dao.factory.DAOFactory;
import by.bsuir.devteam.entity.employee.EmployeeIdComparator;
import by.bsuir.devteam.entity.employee.Tester;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class TesterService {

    private TesterDAO testerDAO = DAOFactory.getInstance().getTesterDAO();

    public void hireTester(Tester tester){
        testerDAO.add(tester);
    }

    public void fireTesterById(int id){
        testerDAO.deleteById(id);
    }

    public Optional<Tester> getTesterById(int id){
        return testerDAO.get(id);
    }

    public void updateTesterDataById(int id, Tester tester){
        testerDAO.update(id, tester);
    }

    public String getAllTesters(){
        return testerDAO.getAll().toString();
    }

    public String getAllTestersSortedByFullName() {
        List<Tester> testers = testerDAO.getAll();
        Collections.sort(testers);
        return testers.toString();
    }

    public String getAllTestersSortedById() {
        List<Tester> testers = testerDAO.getAll();
        testers.sort(new EmployeeIdComparator());
        return testers.toString();
    }
}

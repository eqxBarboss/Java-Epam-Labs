package by.bsuir.devteam.service;

import by.bsuir.devteam.entity.crud.Testers;
import by.bsuir.devteam.entity.employee.Tester;
import by.bsuir.devteam.singleton.SingletonTeam;

import java.util.Optional;

public class TesterService {

    private Testers testers = SingletonTeam.getInstance().getTesters();

    public void hireTester(Tester tester){
        testers.add(tester);
    }

    public void fireTesterById(int id){
        testers.deleteById(id);
    }

    public Optional<Tester> getTesterById(int id){
        return testers.getById(id);
    }

    public void updateTesterDataById(int id, Tester tester){
        testers.update(id, tester);
    }

    public String getAllTesters(){
        return testers.toString();
    }

    public String getAllTestersSortedByFullName() { return testers.toStringSortedByFullName(); }

    public String getAllTestersSortedById() { return testers.toStringSortedById(); }
}

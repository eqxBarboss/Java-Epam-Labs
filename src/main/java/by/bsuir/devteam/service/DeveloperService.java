package by.bsuir.devteam.service;

import by.bsuir.devteam.entity.crud.Developers;
import by.bsuir.devteam.entity.employee.Developer;
import by.bsuir.devteam.singleton.SingletonTeam;

import java.util.List;
import java.util.Optional;

public class DeveloperService {

    private Developers developers = SingletonTeam.getInstance().getDevelopers();

    public void hireDeveloper(Developer developer){
        developers.add(developer);
    }

    public void fireDeveloperById(int id){
        developers.deleteById(id);
    }

    public Optional<Developer> getDeveloperById(int id){
        return developers.getById(id);
    }

    public void updateDeveloperDataById(int id, Developer developer){
        developers.update(id, developer);
    }

    public List<Developer> getDevelopers(){
        return developers.get();
    }
}

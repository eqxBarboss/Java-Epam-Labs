package by.bsuir.devteam.singleton;

import by.bsuir.devteam.entity.Team;
import by.bsuir.devteam.entity.employee.BusinessAnalyst;
import by.bsuir.devteam.entity.employee.Developer;
import by.bsuir.devteam.entity.employee.Tester;

import java.util.ArrayList;
import java.util.List;

public class SingletonTeam {

    private static Team team;

    private SingletonTeam(){

    }

    public static Team getInstance() {
        if (team == null){

            List<Developer> developers = new ArrayList<Developer>();
            List<BusinessAnalyst> businessAnalysts = new ArrayList<BusinessAnalyst>();
            List<Tester> testers = new ArrayList<Tester>();

            team = new Team(testers, developers, businessAnalysts, null, null);
        }
        return team;
    }

    public static void init(Team t) {
        if (team == null) {
            team = t;
        }
    }
}

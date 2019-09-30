package by.bsuir.devteam.singleton;

import by.bsuir.devteam.entity.SoftwareProduct;
import by.bsuir.devteam.entity.Team;
import by.bsuir.devteam.entity.crud.BusinessAnalysts;
import by.bsuir.devteam.entity.crud.Developers;
import by.bsuir.devteam.entity.crud.Testers;
import by.bsuir.devteam.entity.employee.TeamLead;
import by.bsuir.devteam.entity.employee.Tester;

public class SingletonTeam {

    private static Team team;

    private SingletonTeam(){

    }

    public static Team getInstance() {
        if (team == null){

            Developers developers = new Developers();
            BusinessAnalysts businessAnalysts = new BusinessAnalysts();
            TeamLead teamLead = new TeamLead();
            Testers testers = new Testers();
            SoftwareProduct softwareProduct = new SoftwareProduct();

            team = new Team(testers, developers, businessAnalysts, teamLead, softwareProduct);
        }
        return team;
    }

    public static void init(Team t) {
        if (team == null) {
            team = t;
        }
    }
}

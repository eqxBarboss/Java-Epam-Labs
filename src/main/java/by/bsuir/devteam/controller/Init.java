package by.bsuir.devteam.controller;

import by.bsuir.devteam.entity.Team;
import by.bsuir.devteam.entity.crud.BusinessAnalysts;
import by.bsuir.devteam.entity.crud.Developers;
import by.bsuir.devteam.entity.crud.Testers;
import by.bsuir.devteam.exception.XmlOutInException;
import by.bsuir.devteam.parser.XmlTeamParser;
import by.bsuir.devteam.singleton.IdGenerator;
import by.bsuir.devteam.singleton.SingletonTeam;

public class Init {

    public static void Init(){

        XmlTeamParser xmlTeamParser = new XmlTeamParser();

        try {
            Team team = xmlTeamParser.parse("coolTeam.xml");

            if (team.getDevelopers().getDevelopers() == null) team.setDevelopers(new Developers());
            if (team.getTesters().getTesters() == null) team.setTesters(new Testers());
            if (team.getBusinessAnalysts().getBusinessAnalysts() == null) team.setBusinessAnalysts(new BusinessAnalysts());

            SingletonTeam.init(team);
            team.updateMaxId();
            IdGenerator.init(team.getMaxId());
        } catch (Exception e) {
            if (e instanceof XmlOutInException) System.out.println(e.getMessage());
        }
    }
}

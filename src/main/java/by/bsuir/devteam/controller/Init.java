package by.bsuir.devteam.controller;

import by.bsuir.devteam.entity.Team;
import by.bsuir.devteam.entity.employee.BusinessAnalyst;
import by.bsuir.devteam.entity.employee.Developer;
import by.bsuir.devteam.entity.employee.Tester;
import by.bsuir.devteam.exception.XmlOutInException;
import by.bsuir.devteam.parser.XmlTeamParser;
import by.bsuir.devteam.singleton.IdGenerator;
import by.bsuir.devteam.singleton.SingletonTeam;

import java.util.ArrayList;

public class Init {

    public static void Init(){

        XmlTeamParser xmlTeamParser = new XmlTeamParser();

        try {
            Team team = xmlTeamParser.parse("coolTeam.xml");

            if (team.getDevelopers() == null) team.setDevelopers(new ArrayList<Developer>());
            if (team.getTesters() == null) team.setTesters(new ArrayList<Tester>());
            if (team.getBusinessAnalysts() == null) team.setBusinessAnalysts(new ArrayList<BusinessAnalyst>());

            SingletonTeam.init(team);
            team.updateMaxId();
            IdGenerator.init(team.getMaxId());
        } catch (Exception e) {
            if (e instanceof XmlOutInException) System.out.println(e.getMessage());
        }
    }
}

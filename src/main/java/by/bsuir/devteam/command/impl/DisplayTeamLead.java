package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.TeamLead;
import by.bsuir.devteam.service.TeamLeadService;

public class DisplayTeamLead implements Command {

    @Override
    public void execute() {

        TeamLeadService teamLeadService = new TeamLeadService();
        TeamLead teamLead = teamLeadService.getTeamLead();

        if (teamLead != null)
            System.out.println(teamLead);
    }
}

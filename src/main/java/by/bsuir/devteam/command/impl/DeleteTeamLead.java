package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.service.TeamLeadService;

public class DeleteTeamLead implements Command {

    @Override
    public void execute() {

        TeamLeadService teamLeadService = new TeamLeadService();

        if (!teamLeadService.fireTeamLead())
            System.out.println("You can't delete team lead because you don't have one.");
    }
}

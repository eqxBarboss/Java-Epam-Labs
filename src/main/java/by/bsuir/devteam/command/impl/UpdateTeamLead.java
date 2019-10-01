package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.TeamLead;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.TeamLeadService;
import by.bsuir.devteam.utils.DataValidator;

public class UpdateTeamLead implements Command {

    @Override
    public void execute() {
        TeamLeadService teamLeadService = new TeamLeadService();

        TeamLead teamLead = teamLeadService.getTeamLead();

        if (teamLead == null){
            System.out.println("You can't update team lead because you don't have one.");
            return;
        }

        System.out.println(teamLead);

        System.out.println("Enter team leads\'s name:");
        String name = Reader.nextString();

        if (!DataValidator.checkWord(name)) {
            System.out.println("Invalid name.");
            return;
        }

        System.out.println("Enter team leads\'s surname:");
        String surname = Reader.nextString();

        if (!DataValidator.checkWord(surname)) {
            System.out.println("Invalid surname.");
            return;
        }

        System.out.println("Enter team leads\'s phone number:");
        String phoneNumber = Reader.nextString();

        if (!DataValidator.checkPhoneNumber(phoneNumber)) {
            System.out.println("Invalid phone number.");
            return;
        }

        System.out.println("Enter team lead\'s favorite game:");
        String favoriteGame = Reader.nextString();

        System.out.println("Enter team leads\'s motto:");
        String motto = Reader.nextString();

        teamLead.setName(name);
        teamLead.setSurname(surname);
        teamLead.setPhoneNumber(phoneNumber);
        teamLead.setFavoriteGame(favoriteGame);
        teamLead.setMotto(motto);

        teamLeadService.updateTeamLead(teamLead);
    }
}

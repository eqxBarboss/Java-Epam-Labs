package by.bsuir.devteam.command;

import by.bsuir.devteam.command.impl.*;

public enum CommandType {

    ADD_DEVELOPER                       (new AddDeveloper()),
    DELETE_DEVELOPER_BY_ID              (new DeleteDeveloperById()),
    UPDATE_DEVELOPER_BY_ID              (new UpdateDeveloperById()),
    ADD_BUSINESS_ANALYST                (new AddBusinessAnalyst()),
    DELETE_BUSINESS_ANALYST_BY_ID       (new DeleteBusinessAnalystById()),
    UPDATE_BUSINESS_ANALYST_BY_ID       (new UpdateBusinessAnalystById()),
    ADD_TESTER                          (new AddTester()),
    DELETE_TESTER_BY_ID                 (new DeleteTesterById()),
    UPDATE_TESTER_BY_ID                 (new UpdateTesterById()),
    DISPLAY_DEVELOPERS                  (new DisplayDevelopers()),
    DISPLAY_BUSINESS_ANALYSTS           (new DisplayBusinessAnalysts()),
    DISPLAY_TESTERS                     (new DisplayTesters()),
    ADD_TEAM_LEAD                       (new AddTeamLead()),
    DELETE_TEAM_LEAD                    (new DeleteTeamLead()),
    UPDATE_TEAM_LEAD                    (new UpdateTeamLead()),
    ADD_SOFTWARE_PRODUCT                (new AddSoftwareProduct()),
    DELETE_SOFTWARE_PRODUCT             (new DeleteSoftwareProduct()),
    UPDATE_SOFTWARE_PRODUCT             (new UpdateSoftwareProduct()),
    DISPLAY_TEAM_LEAD                   (new DisplayTeamLead()),
    DISPLAY_SOFTWARE_PRODUCT            (new DisplaySoftwareProduct()),
    DISPLAY_DEVELOPER_BY_ID             (new DisplayDeveloperById()),
    DISPLAY_TESTER_BY_ID                (new DisplayTesterById()),
    DISPLAY_BUSINESS_ANALYST_BY_ID      (new DisplayBusinessAnalystById()),
    DISPLAY_HELP                        (new DisplayHelp()),
    EXIT                                (new Exit());

    private Command command;

    CommandType(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}

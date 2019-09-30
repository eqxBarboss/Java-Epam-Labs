package by.bsuir.devteam.command;

import exception.CommandException;

public class CommandFactory {

    public Command getCommand(int number) throws CommandException {
        try {
            String commandNumber = convertToText(number);
            String commandTypeValue = commandNumber.toUpperCase();
            CommandType currentType = CommandType.getCommand(commandTypeValue);
            return currentType.getCommand();
        } catch (IllegalArgumentException e) {
            throw new CommandException("Can't find a Command", e);
        }
    }

    private String convertToText(int number) {
        String result = "";
        switch (number){
            case 1:
                result = "add_developer";
                break;
            case 2:
                result = "delete_developer_by_id";
                break;
            case 3:
                result = "update_developer_by_id";
                break;
            case 4:
                result = "add_business_analyst";
                break;
            case 5:
                result = "delete_business_analyst_by_id";
                break;
            case 6:
                result ="update_business_analyst_by_id";
                break;
            case 7:
                result = "add_tester";
                break;
            case 8:
                result = "delete_tester_by_id";
                break;
            case 9:
                result = "update_tester_by_id";
                break;
            case 10:
                result = "display_developers";
                break;
            case 11:
                result = "display_business_analysts";
                break;
            case 12:
                result = "display_testers";
                break;
            case 13:
                result = "add_team_lead";
                break;
            case 14:
                result = "delete_team_lead";
                break;
            case 15:
                result = "update_team_lead";
                break;
            case 16:
                result = "add_software_product";
                break;
            case 17:
                result = "delete_software_product";
                break;
            case 18:
                result = "update_software_product";
                break;
            case 19:
                result = "display_team_lead";
                break;
            case 20:
                result = "display_software_product";
                break;
            case 21:
                result = "display_developer_by_id";
                break;
            case 22:
                result = "display_tester_by_id";
                break;
            case 23:
                result = "display_business_analyst_by_id";
                break;
            case 0:
                result ="exit";
                break;
        }
        return result;
    }
}
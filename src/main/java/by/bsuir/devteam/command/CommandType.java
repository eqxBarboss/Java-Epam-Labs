package by.bsuir.devteam.command;

import by.bsuir.devteam.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public enum CommandType {

    ADD_DEVELOPER(new HireDeveloper()),
    DELETE_DEVELOPER_BY_ID(new FireDeveloperById()),
    UPDATE_DEVELOPER_BY_ID(new UpdateDeveloperDataById()),
    DISPLAY_DEVELOPERS(new DisplayDevelopers()),
    DISPLAY_DEVELOPER_BY_ID(new DisplayDeveloperById());
    private Command command;

    CommandType(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    private static final Map<String, CommandType> lookup = new HashMap<>();

    static {
        for (CommandType env : CommandType.values()) {
            lookup.put(env.toString(), env);
        }
    }

    public static CommandType getCommand(String type) {
        return lookup.get(type);
    }
}

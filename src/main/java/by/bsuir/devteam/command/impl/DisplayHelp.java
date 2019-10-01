package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.controller.ConsoleCommand;

public class DisplayHelp implements Command {

    @Override
    public void execute() {
        for (ConsoleCommand cc : ConsoleCommand.values()) {
            System.out.println(cc.getNumber() + " - " + cc.getMessage());
        }
    }
}

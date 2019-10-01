package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.service.TesterService;

public class DisplayTesters implements Command {

    @Override
    public void execute() {

        TesterService testerService = new TesterService();
        System.out.println(testerService.getAllTesters());
    }
}

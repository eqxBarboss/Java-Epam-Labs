package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.Developer;
import by.bsuir.devteam.service.DeveloperService;

public class DisplayDevelopers implements Command {

    @Override
    public void execute() {

        DeveloperService developerService = new DeveloperService();

        System.out.println(developerService.getAllDevelopers());
    }
}

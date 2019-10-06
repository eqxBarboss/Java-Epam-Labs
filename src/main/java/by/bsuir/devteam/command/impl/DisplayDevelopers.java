package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.Developer;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.DeveloperService;

public class DisplayDevelopers implements Command {

    @Override
    public void execute() {

        DeveloperService developerService = new DeveloperService();

        System.out.println("Would you like to sort developers?");
        System.out.println("0 - no");
        System.out.println("1 - by full name");
        System.out.println("2 - by id");

        switch (Reader.nextInt()){
            case 0:
                System.out.println(developerService.getAllDevelopers());
                break;
            case 1:
                System.out.println(developerService.getAllDevelopersSortedByFullName());
                break;
            case 2:
                System.out.println(developerService.getAllDevelopersSortedById());
        }
    }
}

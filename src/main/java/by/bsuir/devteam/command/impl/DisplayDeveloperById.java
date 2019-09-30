package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.Developer;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.DeveloperService;

import java.util.Optional;

public class DisplayDeveloperById implements Command {

    @Override
    public void execute() {

        DeveloperService developerService = new DeveloperService();

        System.out.println("Enter developer's id");
        int id = Reader.nextInt();

        Optional<Developer> developer = developerService.getDeveloperById(id);

        developer.ifPresent(Developer::printSelf);
    }
}

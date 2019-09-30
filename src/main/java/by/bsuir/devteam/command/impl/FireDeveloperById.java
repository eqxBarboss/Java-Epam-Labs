package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.DeveloperService;

public class FireDeveloperById implements Command {

    @Override
    public void execute() {

        DeveloperService developerService = new DeveloperService();

        System.out.println("Enter developer's id");
        int id = Reader.nextInt();

        developerService.fireDeveloperById(id);
    }
}

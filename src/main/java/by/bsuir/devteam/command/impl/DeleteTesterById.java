package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.TesterService;

public class DeleteTesterById implements Command {

    @Override
    public void execute() {

        TesterService testerService = new TesterService();

        System.out.println("Enter tester's id");
        int id = Reader.nextInt();

        testerService.fireTesterById(id);
    }
}

package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.Tester;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.TesterService;

import java.util.Optional;

public class DisplayTesterById implements Command {

    @Override
    public void execute() {

        TesterService testerService = new TesterService();

        System.out.println("Enter tester's id");
        int id = Reader.nextInt();

        Optional<Tester> tester = testerService.getTesterById(id);

        tester.ifPresent(System.out::println);
    }
}

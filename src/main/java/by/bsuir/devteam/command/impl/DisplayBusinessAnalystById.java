package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.BusinessAnalyst;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.BusinessAnalystService;

import java.util.Optional;

public class DisplayBusinessAnalystById implements Command {

    @Override
    public void execute() {

        BusinessAnalystService businessAnalystService = new BusinessAnalystService();

        System.out.println("Enter busines analyst's id");
        int id = Reader.nextInt();

        Optional<BusinessAnalyst> developer = businessAnalystService.getBusinessAnalystById(id);

        developer.ifPresent(System.out::println);
    }
}

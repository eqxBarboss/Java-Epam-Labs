package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.BusinessAnalystService;

public class DeleteBusinessAnalystById implements Command{

    @Override
    public void execute() {

        BusinessAnalystService businessAnalystService = new BusinessAnalystService();

        System.out.println("Enter business analyst's id");
        int id = Reader.nextInt();

        businessAnalystService.fireBusinessAnalystById(id);
    }
}

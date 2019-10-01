package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.service.BusinessAnalystService;

public class DisplayBusinessAnalysts implements Command {

    @Override
    public void execute() {

        BusinessAnalystService businessAnalystService = new BusinessAnalystService();
        System.out.println(businessAnalystService.getAllBusinessAnalysts());
    }
}

package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.BusinessAnalystService;

public class DisplayBusinessAnalysts implements Command {

    @Override
    public void execute() {

        BusinessAnalystService businessAnalystService = new BusinessAnalystService();

        System.out.println("Would you like to sort business analysts?");
        System.out.println("0 - no");
        System.out.println("1 - by full name");
        System.out.println("2 - by id");

        switch (Reader.nextInt()){
            case 0:
                System.out.println(businessAnalystService.getAllBusinessAnalysts());
                break;
            case 1:
                System.out.println(businessAnalystService.getAllBusinessAnalystsSortedByFullName());
                break;
            case 2:
                System.out.println(businessAnalystService.getAllBusinessAnalystsSortedById());
        }
    }
}

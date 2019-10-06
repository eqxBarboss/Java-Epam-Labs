package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.TesterService;

public class DisplayTesters implements Command {

    @Override
    public void execute() {

        TesterService testerService = new TesterService();

        System.out.println("Would you like to sort testers?");
        System.out.println("0 - no");
        System.out.println("1 - by full name");
        System.out.println("2 - by id");

        switch (Reader.nextInt()){
            case 0:
                System.out.println(testerService.getAllTesters());
                break;
            case 1:
                System.out.println(testerService.getAllTestersSortedByFullName());
                break;
            case 2:
                System.out.println(testerService.getAllTestersSortedById());
        }
    }
}

package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.service.SoftwareProductService;

public class DeleteSoftwareProduct implements Command {

    @Override
    public void execute() {

        SoftwareProductService softwareProductService = new SoftwareProductService();

        if (!softwareProductService.deleteSoftwareProduct())
            System.out.println("You can't delete software product because you don't have one.");
    }
}


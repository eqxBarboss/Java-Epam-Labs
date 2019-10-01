package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.SoftwareProduct;
import by.bsuir.devteam.service.SoftwareProductService;

public class DisplaySoftwareProduct implements Command {

    @Override
    public void execute() {

        SoftwareProductService softwareProductService = new SoftwareProductService();
        SoftwareProduct softwareProduct = softwareProductService.getSoftwareProduct();

        if (softwareProduct != null)
            System.out.println(softwareProduct);
    }
}

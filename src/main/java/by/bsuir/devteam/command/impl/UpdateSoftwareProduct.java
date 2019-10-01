package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.SoftwareProduct;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.SoftwareProductService;
import by.bsuir.devteam.utils.DataValidator;

public class UpdateSoftwareProduct implements Command{

    @Override
    public void execute() {
        SoftwareProductService softwareProductService = new SoftwareProductService();

        SoftwareProduct softwareProduct = softwareProductService.getSoftwareProduct();

        if (softwareProduct == null){
            System.out.println("You can't update software product because you don't have one.");
            return;
        }

        System.out.println(softwareProduct);

        System.out.println("Enter product's title:");
        String title = Reader.nextString();

        System.out.println("Enter customer's name:");
        String customer = Reader.nextString();

        if (!DataValidator.checkWord(customer)) {
            System.out.println("Invalid customer's name.");
            return;
        }

        softwareProduct.setTitle(title);
        softwareProduct.setCustomer(customer);

        softwareProductService.updateSoftwareProduct(softwareProduct);
    }
}

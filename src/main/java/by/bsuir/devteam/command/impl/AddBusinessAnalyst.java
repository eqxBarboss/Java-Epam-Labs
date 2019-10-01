package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.BusinessAnalyst;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.BusinessAnalystService;
import by.bsuir.devteam.utils.DataValidator;

public class AddBusinessAnalyst implements Command {

    @Override
    public void execute() {

        BusinessAnalystService businessAnalystService = new BusinessAnalystService();

        System.out.println("Enter business analyst\'s name:");
        String name = Reader.nextString();

        if (!DataValidator.checkWord(name)) {
            System.out.println("Invalid name.");
            return;
        }

        System.out.println("Enter business analyst\'s surname:");
        String surname = Reader.nextString();

        if (!DataValidator.checkWord(surname)) {
            System.out.println("Invalid surname.");
            return;
        }

        System.out.println("Enter business analyst\'s phone number:");
        String phoneNumber = Reader.nextString();

        if (!DataValidator.checkPhoneNumber(phoneNumber)) {
            System.out.println("Invalid phone number.");
            return;
        }

        System.out.println("Enter business analyst\'s nickname:");
        String nickname = Reader.nextString();

        BusinessAnalyst businessAnalyst = new BusinessAnalyst();
        businessAnalyst.setName(name);
        businessAnalyst.setSurname(surname);
        businessAnalyst.setPhoneNumber(phoneNumber);
        businessAnalyst.setNickName(nickname);

        businessAnalystService.hireBusinessAnalyst(businessAnalyst);
    }
}

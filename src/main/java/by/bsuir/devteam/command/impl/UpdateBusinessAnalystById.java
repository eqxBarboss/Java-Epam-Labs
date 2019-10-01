package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.BusinessAnalyst;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.BusinessAnalystService;
import by.bsuir.devteam.utils.DataValidator;

import java.util.Optional;

public class UpdateBusinessAnalystById implements Command{

    @Override
    public void execute() {

        BusinessAnalystService businessAnalystService = new BusinessAnalystService();

        System.out.println("Enter business analyst's id:");
        int id = Reader.nextInt();

        Optional<BusinessAnalyst> businessAnalyst = businessAnalystService.getBusinessAnalystById(id);

        if (businessAnalyst.isPresent()){
            BusinessAnalyst ba = businessAnalyst.get();
            System.out.println(ba);

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

            ba.setName(name);
            ba.setSurname(surname);
            ba.setPhoneNumber(phoneNumber);
            ba.setNickName(nickname);

            businessAnalystService.updateBusinessAnalystDataById(id, ba);
        }
        else {
            System.out.println("No business analyst with such id found.");
        }
    }
}
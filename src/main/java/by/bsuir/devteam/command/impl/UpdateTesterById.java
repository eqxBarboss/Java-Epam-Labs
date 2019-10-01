package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.Tester;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.TesterService;
import by.bsuir.devteam.utils.DataValidator;

import java.util.Optional;

public class UpdateTesterById implements Command {

    @Override
    public void execute() {

        TesterService testerService = new TesterService();

        System.out.println("Enter tester's id:");
        int id = Reader.nextInt();

        Optional<Tester> tester = testerService.getTesterById(id);

        if (tester.isPresent()){
            Tester t = tester.get();
            System.out.println(t);

            System.out.println("Enter tester\'s name:");
            String name = Reader.nextString();

            if (!DataValidator.checkWord(name)) {
                System.out.println("Invalid name.");
                return;
            }

            System.out.println("Enter tester\'s surname:");
            String surname = Reader.nextString();

            if (!DataValidator.checkWord(surname)) {
                System.out.println("Invalid surname.");
                return;
            }

            System.out.println("Enter tester\'s phone number:");
            String phoneNumber = Reader.nextString();

            if (!DataValidator.checkPhoneNumber(phoneNumber)) {
                System.out.println("Invalid phone number.");
                return;
            }

            System.out.println("Enter number of written tests:");
            int testsWritten = Reader.nextInt();

            t.setName(name);
            t.setSurname(surname);
            t.setPhoneNumber(phoneNumber);
            t.setTestWritten(testsWritten);

            testerService.updateTesterDataById(id, t);
        }
        else {
            System.out.println("No tester with such id found.");
        }
    }
}

package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.Tester;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.TesterService;
import by.bsuir.devteam.utils.DataValidator;

public class AddTester implements Command {

    @Override
    public void execute() {

        TesterService testerService = new TesterService();

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

        Tester tester = new Tester();
        tester.setName(name);
        tester.setSurname(surname);
        tester.setPhoneNumber(phoneNumber);
        tester.setTestWritten(testsWritten);

        testerService.hireTester(tester);
    }
}

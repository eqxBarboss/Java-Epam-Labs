package by.bsuir.devteam.command.impl;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.entity.employee.Developer;
import by.bsuir.devteam.reader.Reader;
import by.bsuir.devteam.service.DeveloperService;
import by.bsuir.devteam.utils.DataValidator;

import java.util.Optional;

public class UpdateDeveloperDataById implements Command{

    @Override
    public void execute() {

        DeveloperService developerService = new DeveloperService();

        System.out.println("Enter developer's id");
        int id = Reader.nextInt();

        Optional<Developer> developer = developerService.getDeveloperById(id);

        if (developer.isPresent()){
            Developer dev = developer.get();
            System.out.println(dev);

            System.out.println("Enter developer\'s name:");
            String name = Reader.nextString();

            if (!DataValidator.checkWord(name)) {
                System.out.println("Invalid name.");
                return;
            }

            System.out.println("Enter developer\'s surname:");
            String surname = Reader.nextString();

            if (!DataValidator.checkWord(surname)) {
                System.out.println("Invalid surname.");
                return;
            }

            System.out.println("Enter developer\'s phone number:");
            String phoneNumber = Reader.nextString();

            if (!DataValidator.checkPhoneNumber(phoneNumber)) {
                System.out.println("Invalid phone number.");
                return;
            }

            System.out.println("Enter developer\'s favorite game:");
            String favoriteGame = Reader.nextString();

            dev.setName(name);
            dev.setSurname(surname);
            dev.setPhoneNumber(phoneNumber);
            dev.setFavoriteGame(favoriteGame);

            developerService.updateDeveloperDataById(id, dev);
        }
    }
}

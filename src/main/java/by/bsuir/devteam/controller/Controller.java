package by.bsuir.devteam.controller;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.command.CommandType;
import by.bsuir.devteam.command.impl.DisplayHelp;
import by.bsuir.devteam.reader.Reader;

public class Controller {

    public static void main(String[] args) {

        Init.Init();
        Command displayHelp = new DisplayHelp();
        displayHelp.execute();

        int result = Reader.nextInt();

        try {
            while (result != 0) {
                CommandType ct = ConsoleCommand.getCommandTypeByNumber(result);
                ct.getCommand().execute();
                result = Reader.nextInt();
            }
            ConsoleCommand
                    .getCommandTypeByNumber(result)
                    .getCommand()
                    .execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
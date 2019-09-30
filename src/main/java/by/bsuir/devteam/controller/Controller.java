package by.bsuir.devteam.controller;

import by.bsuir.devteam.command.Command;
import by.bsuir.devteam.command.CommandFactory;
import by.bsuir.devteam.reader.Reader;

public class Controller {

    public static void main(String[] args) {
        printCommands();
        int result = Reader.nextInt();
        CommandFactory commandFactory = new CommandFactory();

        try {
            while (result != 0) {
                printCommands();
                Command command = commandFactory.getCommand(result);
                command.execute();
                result = Reader.nextInt();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printCommands() {
        Commands[] values = Commands.values();
        for (Commands o : values) {
            System.out.println(o.getMessage());
        }
    }
}
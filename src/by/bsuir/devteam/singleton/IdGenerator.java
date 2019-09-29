package by.bsuir.devteam.singleton;

public class IdGenerator {
    private static int id;

    private IdGenerator() {
    }

    public static int getNewId() {
        return ++id;
    }

}
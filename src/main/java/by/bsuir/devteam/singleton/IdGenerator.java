package by.bsuir.devteam.singleton;

public class IdGenerator {
    private static int id;

    private IdGenerator() {

    }

    public static int getNewId() {
        return ++id;
    }

    public void init(int id){
        if (this.id == 0){
            this.id = id;
        }
    }

}
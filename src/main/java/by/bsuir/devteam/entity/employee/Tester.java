package by.bsuir.devteam.entity.employee;

public class Tester extends Employee {

    private int testWritten;

    public int getTestWritten() {
        return testWritten;
    }

    public void setTestWritten(int testWritten) {
        this.testWritten = testWritten;
    }

    @Override
    public void printSelf() {
        super.printSelf();

        System.out.println("Tests written: " + testWritten);
    }
}
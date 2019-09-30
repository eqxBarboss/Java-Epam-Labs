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
    public String toString() {
        return super.toString() + System.lineSeparator() +
                "Tests written: " + testWritten;
    }
}
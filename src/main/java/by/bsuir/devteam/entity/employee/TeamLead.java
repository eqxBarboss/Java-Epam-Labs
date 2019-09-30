package by.bsuir.devteam.entity.employee;

public class TeamLead extends Developer {

    private String motto;

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    @Override
    public void printSelf() {
        super.printSelf();

        System.out.println("Motto: " + motto);
    }
}

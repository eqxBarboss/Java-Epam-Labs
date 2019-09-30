package by.bsuir.devteam.entity;

public class SoftwareProduct extends Entity{

    private String customer;
    private String title;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void printSelf() {
        super.printSelf();

        System.out.println("Title: " + title);
        System.out.println("Customer: " + customer);
    }
}

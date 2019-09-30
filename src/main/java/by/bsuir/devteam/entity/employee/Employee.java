package by.bsuir.devteam.entity.employee;

import by.bsuir.devteam.entity.Entity;

public abstract class Employee extends Entity{

    private String name;
    private String surname;
    private String phoneNumber;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printSelf(){

        super.printSelf();

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Phone number: " + phoneNumber);
    }
}
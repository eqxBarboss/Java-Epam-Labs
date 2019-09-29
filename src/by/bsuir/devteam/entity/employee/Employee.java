package by.bsuir.devteam.entity.employee;

import by.bsuir.devteam.entity.Entity;

public abstract class Employee extends Entity{

    private String name;
    private String surname;

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
}
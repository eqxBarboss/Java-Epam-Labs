package by.bsuir.employees;

public class Employee implements java.io.Serializable{
    private String name;
    private String surname;

    public Employee(){

    }

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
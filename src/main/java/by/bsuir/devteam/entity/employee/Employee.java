package by.bsuir.devteam.entity.employee;

import by.bsuir.devteam.entity.Entity;

import java.util.Objects;

public abstract class Employee extends Entity implements Comparable<Employee>{

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

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() +
                "Name: " + name + System.lineSeparator() +
                "Surname: " + surname + System.lineSeparator() +
                "Phone number: " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname) &&
                Objects.equals(phoneNumber, employee.phoneNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), name, surname, phoneNumber);
    }

    @Override
    public int compareTo(Employee o) {

        int result = this.getSurname().compareTo(o.getSurname());
        return result == 0 ? this.getName().compareTo(o.getName()) : result;
    }
}
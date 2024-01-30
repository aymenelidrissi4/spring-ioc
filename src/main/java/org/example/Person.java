package org.example;

public class Person {
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void customInit() {
        System.out.println("inside custom initialization");
    }

    public void customDestroy() {
        System.out.println("inside custom destroy");
    }
}
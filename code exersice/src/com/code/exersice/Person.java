package com.code.exersice;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public static void main(String[] args) {

        Person p = new Person();
        p.setFirstName("");
        p.setLastName("");
        p.setAge(10);
        System.out.println("Firstname: " + p.getFirstName());
        System.out.println("teen = " + p.isTeen());
        p.setFirstName("John");
        p.setAge(18);
        System.out.println("Fullname: " + p.getFullName());
        System.out.println("teen = " + p.isTeen());
        p.setLastName("Smith");
        System.out.println("Fullname: " + p.getFullName());


    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100)
            this.age = 0;
        else
            this.age = age;


    }

    public boolean isTeen() {

        return (age > 12 && age < 20);
    }

    public String getFullName() {

        if (firstName.isEmpty()) {

            return lastName;
        } else if (lastName.isEmpty()) {

            return firstName;
        } else if (firstName.isEmpty() && lastName.isEmpty()) {

            return null;
        } else
            return (firstName + " " + lastName);
    }

}

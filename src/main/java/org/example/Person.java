package org.example;

public class Person {
private   String firstName;
private String lastName;
private int age;
private double salary;
private boolean isMarried;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person(String firstName, String lastName, int age ,double salary, boolean isMarried ) {
        this(firstName,lastName,age);
        this.salary = salary;
        this.isMarried = isMarried;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

}

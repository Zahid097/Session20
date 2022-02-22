package com.company;

public class Driver extends AbstractPerson implements CanDrive {

    String company;

    @Override
    public void Drive() {
        System.out.println("He can driving!");
    }

    public Driver() {

    }

    public Driver(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Driver{" + "company='" + company
                + '\'' + "} " + super.toString();
    }
}

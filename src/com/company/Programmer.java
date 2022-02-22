package com.company;

public class Programmer extends AbstractPerson implements SwimAble, CanDrive {

    String company;

    @Override
    public void Swim() {
        System.out.println("He can swimming!");
    }

    @Override
    public void Drive() {
        System.out.println("He can driving!");

    }

    public Programmer() {

    }

    public Programmer(String name, int age, String company) {
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
        return "Programmer{" + "company='" + company
                + '\'' + "} " + super.toString();
    }

}

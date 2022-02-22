package com.company;

public class Seaman extends AbstractPerson implements SwimAble {

    private String from;

    @Override
    public void Swim() {
        System.out.println("He can swimming!");
    }

    public Seaman() {

    }

    public Seaman(String name, int age, String from) {
        super(name, age);
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "Seaman{" + "from='" + from +
                '\'' + "} " + super.toString();
    }
}

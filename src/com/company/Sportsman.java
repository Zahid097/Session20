package com.company;

public class Sportsman extends AbstractPerson implements SwimAble, CanDrive {

    private String directions;

    @Override
    public void Swim() {
        System.out.println("He can swimming!");
    }

    @Override
    public void Drive() {
        System.out.println("He can driving!");
    }

    public Sportsman() {

    }

    public Sportsman(String name, int age, String directions) {
        super(name, age);
        this.directions = directions;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    @Override
    public String toString() {
        return "Sportsman{" + "directions='" + directions
                + '\'' + "} " + super.toString();
    }
}

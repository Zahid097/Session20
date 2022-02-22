package com.company;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer();
        Programmer programmer1 = new Programmer();

        Sportsman sportsman = new Sportsman();
        Sportsman sportsman1 = new Sportsman();

        Seaman seaman = new Seaman();
        Seaman seaman1 = new Seaman();

        Driver driver = new Driver();
        Driver driver1 = new Driver();

        AbstractPerson[] people =
                {programmer, programmer1, sportsman,
                        sportsman1, seaman, seaman1, driver, driver1};

        Pool pool = new Pool();
        pool.setPeople(people);
        System.out.println(pool);

    }
}

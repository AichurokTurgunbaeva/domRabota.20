package com.company;

public class Car implements AutoCloseable {

    void drive() {
        System.out.println("Машина журуп жатат.");
    }

    @Override
    public void close() {
        System.out.println("Машина жабылып жатат.");
    }

}

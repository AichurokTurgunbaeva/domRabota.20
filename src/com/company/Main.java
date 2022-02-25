package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Car car = new Car();

    try {
        System.out.println(20 / 0);
        car.drive();
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
        car.close();
        car.drive();

        }
    }
}

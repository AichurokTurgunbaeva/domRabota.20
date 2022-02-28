package com.company;

import java.io.UncheckedIOException;

public class Main {

    public static void main(String[] args) throws Exception {

    try { Car car = new Car();
          car.drive();
    } catch (UncheckedIOException e) {
        e.printStackTrace();

        }
     }
  }


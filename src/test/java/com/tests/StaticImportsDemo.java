package com.tests;

import com.github.javafaker.Faker;

import static com.tests.A.*;

//In Java, only static methods or fields can be imported with static imports.
// Non-static methods and fields must be accessed through an instance of the class they belong to.

public class StaticImportsDemo {

    public static void main(String[] args) {

        // Call static methods directly
        methodA();
        methodB();

        // Create an instance of A to call the non-static method
        A a = new A();
        a.methodC();

        //Faker Library Usage Demo
        Faker faker = new Faker();
        for (int i=1;i<=5;i++){
            //System.out.println(faker.name().firstName());
            //System.out.println(faker.address().cityName());
            //System.out.println(faker.superhero().name());
            //System.out.println(faker.idNumber());
            System.out.println(faker.idNumber().ssnValid());
        }


    }
}

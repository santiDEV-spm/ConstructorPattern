package com.santidev;

public class Main {

    public static void main(String[] args) {
	    Car car = Director.construct(new ConcreteBuilder());
        System.out.println(car.getHead());
        System.out.println(car.getBody());
        System.out.println(car.getWheel());
    }
}

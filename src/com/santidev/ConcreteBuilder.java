package com.santidev;

public class ConcreteBuilder implements Builder{

    Car car;

    public ConcreteBuilder(){
        car = new Car();
    }

    @Override
    public void buildHead() {
        car.setHead("Car head contruction completed");
    }

    @Override
    public void buildBody() {
        car.setBody("Car body construction completed");
    }

    @Override
    public void buildWheel() {
        car.setWheel("Car wheel construction completed");
    }

    @Override
    public Car buildPart() {
        return this.car;
    }
}

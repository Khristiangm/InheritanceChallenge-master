package com.timbuchalka;

public class Vehicle {

    private String colour;
    private String name;
    private String model;
    private int doors;
    private int chassis;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String colour, String name, String model, int doors, int chassis) {
        this.colour = colour;
        this.name = name;
        this.model = model;
        this.doors = doors;
        this.chassis = chassis;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + "in direction " + currentDirection);

    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public int getChassis() {
        return chassis;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}

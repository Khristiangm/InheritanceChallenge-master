package com.timbuchalka;

/**
 * Created by KH389659 on 26/09/2017.
 */
public class Car extends Vehicle {

    private int gear;
    private int wheels;
    private int powerRating;
    private boolean isManual;

    private int currentGear;

    public Car(String colour, String name, String model, int doors, int chassis, int gear, int wheels, int powerRating, boolean isManual) {
        super(colour, name, model, doors, chassis);
        this.gear = gear;
        this.wheels = wheels;
        this.powerRating = powerRating;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear." );
    }
    public void changeVelocity(int speed, int direction) {
        move(speed,direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + "Direction" + direction);
    }
}

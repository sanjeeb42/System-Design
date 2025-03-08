package LowLevelDesign.DesignPatterns.StrategyDesignPattern;

import LowLevelDesign.DesignPatterns.StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;
    Vehicle(DriveStrategy driveObject){
        this.driveObject=driveObject;
    }

    public void drive(){
        driveObject.drive();
    }
}

package LowLevelDesign.DesignPatterns.StrategyDesignPattern;

import LowLevelDesign.DesignPatterns.StrategyDesignPattern.Strategy.DriveStrategy;
import LowLevelDesign.DesignPatterns.StrategyDesignPattern.Strategy.SportsDriveCapability;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveCapability());
    }
}

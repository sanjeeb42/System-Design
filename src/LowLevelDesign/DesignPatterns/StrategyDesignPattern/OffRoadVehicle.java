package LowLevelDesign.DesignPatterns.StrategyDesignPattern;

import LowLevelDesign.DesignPatterns.StrategyDesignPattern.Strategy.DriveStrategy;
import LowLevelDesign.DesignPatterns.StrategyDesignPattern.Strategy.SportsDriveCapability;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportsDriveCapability());
    }
}

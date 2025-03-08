package LowLevelDesign.DesignPatterns.StrategyDesignPattern;

import LowLevelDesign.DesignPatterns.StrategyDesignPattern.Strategy.DriveStrategy;
import LowLevelDesign.DesignPatterns.StrategyDesignPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}

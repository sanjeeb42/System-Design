package LowLevelDesign.DesignPatterns.StrategyDesignPattern.Strategy;

public class SportsDriveCapability implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}

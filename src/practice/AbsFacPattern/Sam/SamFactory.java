package practice.AbsFacPattern.Sam;

import practice.AbsFacPattern.abst.BikeFactory;
import practice.AbsFacPattern.abst.Body;
import practice.AbsFacPattern.abst.Wheel;

public class SamFactory implements BikeFactory {
    @Override
    public Body createBosy() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}

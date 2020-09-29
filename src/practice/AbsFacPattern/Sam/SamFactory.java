package practice.AbsFacPattern.Sam;

import practice.AbsFacPattern.BikeFactory;
import practice.AbsFacPattern.Body;
import practice.AbsFacPattern.Wheel;

public class SamFactory implements BikeFactory {
    @Override
    public Body createBosy() {
        return null;
    }

    @Override
    public Wheel createWheel() {
        return null;
    }
}

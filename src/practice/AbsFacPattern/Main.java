package practice.AbsFacPattern;

import practice.AbsFacPattern.Sam.SamFactory;
import practice.AbsFacPattern.abst.BikeFactory;
import practice.AbsFacPattern.abst.Body;
import practice.AbsFacPattern.abst.Wheel;

public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
        Body body = factory.createBosy();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}

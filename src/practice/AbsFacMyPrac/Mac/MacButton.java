package practice.AbsFacMyPrac.Mac;

import practice.AbsFacMyPrac.abst.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Macbook Button was clicked!");
    }
}

package com.Bootcamp.java.OOP.Phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        System.out.println("iPhone " + getVersionNumber() + " says " );
        return getRingTone();
    }
    @Override
    public String unlock() {
        return "Face detected, iPhone unlocked";
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery change.");     
    }
}
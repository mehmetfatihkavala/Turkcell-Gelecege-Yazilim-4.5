package org.turkcell.intro;

public class Motorcycle extends Vehicle{
    private  boolean hasBag;

    public Motorcycle(){}

    public Motorcycle(String brand, String model, int year, float km, boolean hasBag) {
        super(brand, model, year, km);
        this.hasBag = hasBag;
    }

    public boolean isHasBag() {
        return hasBag;
    }

    public void setHasBag(boolean hasBag) {
        this.hasBag = hasBag;
    }

    // Method Overriding

    @Override
    public void startRent() {
        System.out.println("Motorcycle Rent");
        super.startRent();
    }
}

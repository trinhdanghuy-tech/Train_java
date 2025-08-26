package test.vehicle;

public class Bicycle extends Vehicle {
    private boolean hasBasket;
    public Bicycle(String brand, int speed, boolean hasBasket) {
        super(brand, speed);
        this.hasBasket = hasBasket;
    }
    public boolean hasBasket() {
        return hasBasket;
    }
    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }
    @Override
    public void move() {
        System.out.println("Bicycle is pedaling.");
    }
}

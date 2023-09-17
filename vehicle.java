class Vehicle {
    protected int speed;

    public Vehicle() {
        speed = 0;
    }

    public void speedUp() {
        speed += 10;
        System.out.println("Vehicle speed increased by 10 units");
    }

    public int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp(); // Call the parent class method
        System.out.println("Car's speed increased by an additional 20 units");
        super.speedUp(); // Increase speed by another 10 units
    }
}

class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp(); // Call the parent class method
        System.out.println("Bicycle's speed increased by an additional 5 units");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // Speed up the car and bicycle
        car.speedUp();
        bicycle.speedUp();

        // Display the current speed
        System.out.println("Car's current speed: " + car.getSpeed());
        System.out.println("Bicycle's current speed: " + bicycle.getSpeed());
    }
}

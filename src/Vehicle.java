import java.util.Scanner;

class Vehicle {
    int speed = 20;

    void speedUp() {
        System.out.println("The vehicle is speeding up.");
    }
}

class Car extends Vehicle {
    Scanner scan = new Scanner(System.in);

    @Override
    void speedUp() {
        System.out.println("Do you want to increase the speed of the Car? (true/false): ");
        boolean increasedSpeedBy = scan.nextBoolean();

        if (increasedSpeedBy) {
            speed += 20;
            System.out.println("Car speed increased to: " + speed + " km/h");
        } else {
            System.out.println("Car speed not increased.");
        }
    }
}

class Bicycle extends Vehicle {
    Scanner scan = new Scanner(System.in);

    @Override
    void speedUp() {
        System.out.println("Do you want to increase the speed of the Bicycle? (true/false): ");
        boolean increasedSpeedBy = scan.nextBoolean();

        if (increasedSpeedBy) {
            speed += 5;
            System.out.println("Bicycle speed increased to: " + speed + " km/h");
        } else {
            System.out.println("Bicycle speed not increased.");
        }
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.speedUp();

        obj = new Car();
        obj.speedUp();

        obj = new Bicycle();
        obj.speedUp();
    }
}

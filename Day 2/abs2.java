abstract class Vehicle {
    public abstract void start();
    public abstract void stop();
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine started with a key or button.");
    }

    @Override
    public void stop() {
        System.out.println("Car brakes applied. Engine turned off.");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started using kick or self-start.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped and engine turned off.");
    }
}

public class abs2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start();
        myCar.stop();

        System.out.println();

        myBike.start();
        myBike.stop();
    }
}

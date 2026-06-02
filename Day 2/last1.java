interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flaps its wings and flies.");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane uses jet engines to fly.");
    }
}

public class last1 {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable plane = new Airplane();

        bird.fly();
        plane.fly();
    }
}

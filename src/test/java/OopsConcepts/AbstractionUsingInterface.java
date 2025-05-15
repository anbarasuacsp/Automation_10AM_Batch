package OopsConcepts;

interface Vehicle {
    void move();  // Interface method
}

class Bike implements Vehicle {
    public void move() {
        System.out.println("Bike is moving");
    }

public class AbstractionUsingInterface {

        public static void main(String[] args) {
            Vehicle v = new Bike();
            v.move();
        }
    }

}

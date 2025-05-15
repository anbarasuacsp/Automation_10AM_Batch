package OopsConcepts;

class Car {

    String color = "Red";

    void drive() {
        System.out.println("The car is driving");
    }

    public static void main(String[] args) {

        Car myCar = new Car();  // Creating object
        System.out.println("Color: " + myCar.color);
        myCar.drive();  // Calling method
    }
}
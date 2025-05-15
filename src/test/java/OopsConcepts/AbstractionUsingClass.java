package OopsConcepts;

abstract class Shape {
    abstract void draw();  // Abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }


public class AbstractionUsingClass {

        public static void main(String[] args) {
            Shape s = new Circle();
            s.draw();
        }
    }

}

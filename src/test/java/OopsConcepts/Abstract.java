package OopsConcepts;

public class Abstract {

    abstract class shape{
         void draw(){
        }
    }

    private class circle extends shape{
        @Override
        void draw(){
            System.out.println("I can draw a circle");
        }
    }
    private class triangle extends shape{

        @Override
        void draw(){
            System.out.println("I can draw a triangle");
        }
    }


    public void  main(String[] args) {

        triangle tri = new triangle();
        tri.draw();
    }

}

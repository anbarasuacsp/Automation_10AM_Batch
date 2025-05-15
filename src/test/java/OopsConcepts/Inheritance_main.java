package OopsConcepts;

class parent {
    void Assertes(){
        System.out.println("Parents 1 billion money");

    }

}


class  child extends parent {

    @Override
    void Assertes(){
        System.out.println("Parents 1 1/2 billion money");
    }

}


public class Inheritance_main{

    public static void main(String[] args) {
        child c = new child();
        c.Assertes();

    }
}

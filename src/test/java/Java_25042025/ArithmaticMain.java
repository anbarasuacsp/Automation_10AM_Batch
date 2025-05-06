package Java_25042025;



class addition{
    static void add(int a, int b){
        int c=a+b;
        System.out.println("Addition value from the Addtion class and add method: " +c);
    }

}

class Subraction{

    void sub(int a, int b){
        int c=a-b;
        System.out.println("Subraction value from the Addtion class and add method: " +c);
    }
}

class multiplication{

    void multi(int a, int b){
        int c=a+b;
        System.out.println("Multiplication value from the Addtion class and add method: " +c);
    }

}



public class ArithmaticMain {

    public static void main(String[] args) {

        addition Addi =new addition();
        Addi.add(10, 40);




    }
}

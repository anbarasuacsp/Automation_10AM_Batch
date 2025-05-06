package Java_30042025;

import Java_28042025.class2;

class class1{
    static void methodclass1(){

        System.out.println("This is a method from class1");

    }

    public static void main(String[] args) {
        methodclass1();
        MainClass main = new MainClass();
        main.mainclassmethod();

    }

}



public class MainClass {

    static void mainclassmethod(){
        System.out.println("This is from main class method");
    }

    public static void main(String[] args) {
        mainclassmethod();
        class1 cl1 = new class1();
        cl1.methodclass1();
        class2 cl2 = new class2();
        cl2.methodclass2();
        class3 cl3 = new class3();
        cl3.methodclass3();
        class4 cl4 = new class4();
        cl4.methoclass4();
        class5 cl5 = new class5();
        cl5.methodclass5();
        class6 cl6 = new class6();
        cl6.methodclass6();
    }
}

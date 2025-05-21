package Java_02052025;

public class DefaultConstructor {

    DefaultConstructor(){
        System.out.println("This a Default Constructor");
    }
    void method2(){

    }
    static void method1(){
        System.out.println("This is method1");
    }
    public static void main(String[] args) {
        method1();
        DefaultConstructor df = new DefaultConstructor();
        df.method2();
    }

}

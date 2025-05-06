package Java_05052025;

public class Java_05052025 {

    int a=0;
    int b=0;

    Java_05052025(){
        System.out.println("This is from constructor");
    }

    private Java_05052025(int a ,int b){
        int x = a;
        int y =b;
    }

    void method1(int x, int y){
        int z = x+y;
        System.out.println(z);
    }

    static  int method2(){

        return 0;
    }


    public static void main(String[] args) {
        Java_05052025 java05052025 = new Java_05052025();
        java05052025.method1(30, 20);

        method2();








    }
}

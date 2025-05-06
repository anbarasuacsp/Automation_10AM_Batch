package Java_25042025;


class Arithmatic {

    static int addition(int a, int b){
        int c=a+b;
        System.out.println("Addition of a and b: "+c);
        return c;
    }
    static void subraction(int a, int b){
        int c=a-b;
        System.out.println("Subraction of a and b: "+c);
    }
    static void multiplication(int a, int b){

        int c=a*b;
        System.out.println("Multiplication value of a and b:"+c);

    }
    public static void main(String[] args) {
        addition(50,60);
        subraction(50, 60);
        multiplication(90,80);

    }


}

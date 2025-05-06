package Java_05052025;

public class ConditionalIf {
    public static void main(String[] args) {
        int x=10;
        int y=20;
//        if (x>y){
//            System.out.println("x is greater than y");
//        }else {
//            System.out.println("x is lesser than y");
//        }
        if( x>y){
            System.out.println("x is greater than y");
        } else if (x==y) {
            System.out.println("x value is exactly equals to y");
        } else if (x<y){
            System.out.println("x is lesser than y");
        } else if (x>=y){
            System.out.println("x is greater than or equls");
        }else {
            System.out.println("Given value is invalid");
        }


    }
}

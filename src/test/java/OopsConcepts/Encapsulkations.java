package OopsConcepts;



class  person{

    private int age;

    public int age(){

        return age;
    }

    public void setage(int a){
        if(a>0){
            age=a;
            System.out.println("Given age value is valid");
        }else {
            System.out.println("Given age value is invalid");
        }

    }


}







public class Encapsulkations {

    public static void main(String[] args) {

        person p = new person();
        p.setage(500);
        p.age();



    }
}

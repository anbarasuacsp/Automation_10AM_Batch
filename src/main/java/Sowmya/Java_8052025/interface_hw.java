package Sowmya.Java_8052025;

public class interface_hw {

}
default void name() {
}
default void rollnumber(){

}
default void admissionnumber(){

}
default void dob(){

}
default void bloodgroup(){

}
default void phonenumber(){

}
default void group(){

}
}
class sowmiya implements studentsdetails {
    public void name() {
        System.out.println("student name=sowmiya");
    }

    public void rollnumber() {
        System.out.println("student rollnumber=1");
    }

    public void admissionnumber() {
        System.out.println("student admin number=1000");
    }

    public void dob() {
        System.out.println("student dob=08-06-1990");
    }

public void bloodgroup() {
        System.out.println("student blood group=b+");

    }

    public void phonenumber() {
        System.out.println("student phone number=8939657539");
    }

    public void group() {
        System.out.println("student group= group 1");
    }
}
public class interface_hw {
    public static void main(String[] args) {

        sowmiya so= new sowmiya();
        so.name();
        so.rollnumber();
        so.admissionnumber();
        so.dob();
        so.bloodgroup();
        so.group();
    }
}

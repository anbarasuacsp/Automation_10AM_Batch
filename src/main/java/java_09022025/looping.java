package java_09022025;

import javax.imageio.stream.ImageInputStream;

public class looping {
    void forloopmethod(){

        for (int i=0;i<=10;i++) {

            if (i == 0 && i <= 12) {
                System.out.println("Good morning");
            } else if (i == 5) {
                System.out.println("Its for hus");
            } else {
                System.out.println("good nit");
            }
        }
        public static void main(String[] args) {
            forloopmethod l = new forloopmethod(){
                l.looping();
            }
        }


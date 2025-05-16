package programs_;

import java.util.Arrays;

public class corejava {

    public static void main(String[] args) {
        // Reverse a String
//        String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String name_rev = "";
//        for (int i=name.length()-1;i>=0;i--){
//            name_rev=name_rev+name.charAt(i);
//            System.out.println(" "+name_rev+" ");
//        }

        // Reverse a number or Integer

//        int num = 58767587;
//        int num_rev = 0;
//
//        while (num!=0){
//            int digit = num % 10;           // Get last digit  5876758.7
//            num_rev = num_rev * 10 + digit;  // Append digit to reversed
//            num = num/ 10;              // Remove last digit
//        }
//
//        System.out.println("Reversed number: " + num_rev);

        // String Reverse using  string builder string buffer

//        String input ="Gohila";
//        String input1 = "Sowmya";
//
//        StringBuilder sb = new StringBuilder(input);
//        StringBuffer sbf = new StringBuffer(input1);
//        String name = sb.reverse().toString();
//        String name1 = sbf.reverse().toString();
//        System.out.println(name);
//        System.out.println(name1);

        // Print even count word in the sentence

        String sent = "I am in a beautiful world am in love seven"; // [I, an, in, a,beautiful,world  ]
        String[] words = sent.split(" ");

        for (int i=0; i<= words.length; i++){
            if (words[i].length()%2==0){
                System.out.println("Yes its all r even count word : "+ words[i]);
            } else {
                System.out.println("Not a even count words : "+words[i]);
            }
        }









    }
        }

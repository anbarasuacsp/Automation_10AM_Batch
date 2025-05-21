package programs_;

import java.util.Arrays;

public class Java_19052025 {
    public void reverseasentence(){
        String sentence = "I am in the world of Java";
        String[] word = sentence.split(" ");
        StringBuilder sb = new StringBuilder(Arrays.toString(word));
        sb.reverse();
        System.out.println(sb.reverse());
    }

    public void evencountword(){
        String sent = "I am in a beautiful world am in love seven"; // [I, an, in, a,beautiful,world  ]
        String[] words = sent.split(" ");
        for (int i=0; i< words.length; i++){
            if (words[i].length()%2==0){
                System.out.println("Yes its all r even count word : "+ words[i]);
            } else {
                System.out.println("Not a even count words : "+words[i]);
            }
        }
    }
    public static void main(String[] args) {
        Java_19052025 js = new Java_19052025();
//        js.reverseasentence();
        js.evencountword();
    }
}

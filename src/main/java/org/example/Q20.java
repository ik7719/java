package org.example;

import java.util.Arrays;

public class Q20 { //완료

    public static String solution(){

        String[] participant = new String[] {"leo", "kiki", "eden", "vinko"};
        String[] completion = new String[] {"leo", "kiki", "eden"};

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;

        for(i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i]) ){
                return participant[i];
            }
        }
        return participant[i];
    }
    public static void main(String[] args){

        System.out.println(solution());

    }
}

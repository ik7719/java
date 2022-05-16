package org.example;

import javax.annotation.processing.Completion;

public class Q20 {
    public static void main(String[] args){
        String answer = "";

        String[] participant = new String[] {"leo", "kiki", "eden"};
        String[] completion = new String[] {"leo", "kiki"};

        for(int i = 0; i < participant.length; i++) {
            if(participant != completion){
                participant.removeAll(completion);
                System.out.println("차집합 :" + Participant.toString() );
            }
            else {
                System.out.println("교집합이 없습니다.");
            }
        }
    }
}

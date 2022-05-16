package org.example;

import java.util.ArrayList;
import java.util.List;

public class Q20 {
    public static void main(String[] args){

        List<String> participant = new ArrayList<String>();
        participant.add("leo");
        participant.add("kiki");
        participant.add("eden");

        List<String> completion = new ArrayList<String>();
        completion.add("leo");
        completion.add("kiki");

        participant.removeAll(completion);

        System.out.println(participant);
    }
}

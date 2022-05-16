package org.example;

public class Q17 {
    public static void main(String[] args){

            String REGEX = "[0-9]+";
            String[] s = {"1234"};

            for(int i = 0; i < s.length; i++){
                if(s[i].matches(REGEX)){
                    System.out.println("true");
                } else {
                    System.out.println("False");
                }
            }
        }
    }


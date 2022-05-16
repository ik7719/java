package org.example;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        long b = scan.nextLong();

        long answer = 0;

        if(a < b) {
            for(long i = a; i <= b; i++){
                answer += i;
            }
        } else {
            for(long i = b; i <= a; i++){
                answer += i;
            }
        }
        System.out.println(answer);
    }
}

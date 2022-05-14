package org.example;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String phone_number = scan.next();

//        String answer = "";
        String number = phone_number;

        String result = number.substring(number.length()-4, number.length());
        System.out.println(result);

//        answer = result;
    }
}

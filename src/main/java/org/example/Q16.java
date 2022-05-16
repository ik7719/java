package org.example;

import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        System.out.println(countChar(str, 'p'));
        System.out.println(countChar(str, 'y'));


    }

    public static int countChar(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) { // charAt : 문자열에서 문자를 뽑는 함수
                count++;
            }
        }



        return count;
    }
}


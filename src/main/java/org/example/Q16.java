package org.example;

import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'p' || str.charAt(i) == 'P') ++count;
            // charAt : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 메소드
            // char 타입 : 하나의 문자를 저장하기 위한 자료형
            // charAt() 에서 괄호는 index 번호
            if(str.charAt(i) == 'y' || str.charAt(i) == 'Y') --count;
            // a 또는 b가 참이면 연산결과로 참 반환
        }
        if(count == 0){
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }
}
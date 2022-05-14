package org.example;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String phone_number = scan.next();

//        String answer = "";

        String rearNum = phone_number;
        String frontNum = phone_number;

        // 앞에 7줄만 별로 표기
        String frontResult = frontNum.substring(0,7); // 앞에서 7 인덱스를 남기고 나머지 제거

        // 별모양으로 표기


        //뒤에 4 단어는 숫자로 표기
        String rearResult = rearNum.substring(rearNum.length()-4, rearNum.length());
        // 뒤에 4 단어만 잘라서 보여줌
//        String rearNum = rearNum.substring(4, rearNum.length()); // 앞에 4단어를 자르고 보여줌.

        System.out.println(frontResult);
        System.out.println(rearResult);

//        answer = result;
    }
}

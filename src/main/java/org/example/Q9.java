package org.example;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int price = scan.nextInt();
        int money = scan.nextInt();
        int count = scan.nextInt();

        int sum = 0;
        int answer = 0;

        for(int i = 0; i < count; i++){
            sum += price * (i + 1);
        }

        if(money < sum){
            answer = sum - money;
            System.out.println(answer);
        } else {
            System.out.println("0");
        }
    }
}

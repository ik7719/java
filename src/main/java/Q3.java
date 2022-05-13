import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
//        String answer = "";

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        int b = a / 2;

        // [0]과 [변수.length] 제거
        // 나머지 배열의 값을 출력



        if(b % 2 == 0){
            int[] intEven = new int[b];
            intEven[0].remove;
            intEven[length].remove;
            // intEven이라는 변수가 있는데 양 끝 배열 index값은 제거됨.
            // 나머지 배열의 값들 출력
            // intEven은 정수타입 / answer는 문자타입

                System.out.println(Arrays.toString(intEven));
            }
        } else {
        int[] intOdd = new int[b];
        intOdd[0].remove;
        intOdd[length].remove;

        System.out.println(Arrays.toString(intEven));

    }
}

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 자동 import alt + enter

        int n = scan.nextInt();


        // n과 m을 배열의 length 값으로 만들어야 함.
        // 그래서 length값만큼 문자가 출력이 되게 해야 해.

        for(int row = 0; row < n; row++){
//            System.out.print(row);
//            System.out.print(row.replaceAll("*"));
            String rowStr = Integer.toString(row); // int타입을 string타입으로 변환
            System.out.println(rowStr.replaceAll("", "*"));

//            출력값
//            *0*
//            *1*
//            *2*
//            *3*
//            *4*
        }





    }
}




//        int[] arr = scan.nextInt();

//        double answer = 0;
//        double sum = 0;
//
//        for(int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            // arr 변수의 각 배열을 더한다.
//        }
//
//        answer = sum/arr.length;
//        // 더 했던 값을 배열의 크기로 나눈다.
//
//        System.out.println(answer);

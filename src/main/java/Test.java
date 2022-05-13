import java.util.Arrays;

public class Test {

    public static void main(String args[]){

//        문자 변수 s와 정수형 변수 10을 선언하고 출력해보세요.
          String word = "s";
          int num = 10;
          System.out.println(word + "," + num);
          // \n : 줄 바꿈(변경)

        // 크기가 3개인 정수형 변수를 선언하고 10, 20 ,30 이라는 숫자를 할당
        // 그 배열의 마지막 값 30이라는 값을 배열 변수를 이용해서 출력

        int[] arr = new int[]{10, 20, 30};
        System.out.println(arr[2]);

        int[] arr2 = new int[]{10, 20, 30};
        System.out.println(arr2[arr2.length - 1]);



    }
}

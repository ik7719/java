package new_prac;

import java.util.Arrays;

public class Q11_prac {
    public static void main(String[] args){

        long x = 3;
        int n = 5;

        long[] arr = new long[n];

        for(int i = 0; i < n; i++){
            arr[i] = x * (i + 1);
        }
        System.out.println(Arrays.toString(arr));
        // 파라미터로 배열을 입력받아서 배열에 정의된 값들을 문자열 형태로 만들어서 리턴
    }
}

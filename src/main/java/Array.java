import java.util.Arrays;

public class Array {
    public static void main(String[] args){

        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));
        // 배열 값을 정해주지 않았을 때, int타입은 default값인 0으로 선언

        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));
        // 이미 인덱스 값을 설정했고 배열의 크기도 지정

        String[] stringEmptyArray = new String[5];
        System.out.println(Arrays.toString(stringEmptyArray));
        // 배열 값을 정해주지 않았을 때, String타입은 default값인 0으로 선언

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));
        // Arrays.toString : 배열의 모든 요소를 문자열로 만들어서 반환하라

        System.out.println(season[season.length - 1]);
        // 변수 season의 length의 값은 4이고,
        // 배열의 인덱스 값은 0, 1, 2, 3
        // 따라서, 인덱스 값이 4인 변수의 값은 없기 때문에 -1을 해준다.
    }
}

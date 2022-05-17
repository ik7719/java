package new_prac;

import java.util.ArrayList;
import java.util.Comparator;

public class Q24_prac {
    public static void main(String[] args){
        long n = 118372;

        String strResult = "";

        String num = Long.toString(n); // string타입으로 변환 / index 값을 얻기 위함.

        ArrayList list = new ArrayList();

        for(int i = 0; i < num.length(); i++){ //
            list.add(num.charAt(i)); // 리스트에 한 글자씩 삽입 / list의 정렬기능을 사용하기 위해
        }
        list.sort(Comparator.reverseOrder()); // 내림차순 정렬

        for(int j = 0; j < num.length(); j++){
            strResult += list.get(j);
        }
        long answer = Long.parseLong(strResult); // string타입을 다시 long타입으로 변환
        System.out.println(answer);
    }
}

package new_prac;

public class Q8_prac {
    public static void main(String[] args){
        int[] arr = new int[] {1, 2, 3, 4};
        double answer = 0;
        double result = 0;

        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }

        answer = result / arr.length; // int타입이라면 2.5에서 .5 버림 처리

        System.out.println(answer);
    }

}

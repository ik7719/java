package new_prac;

public class Q6_prac {
    public static void main(String[] args){
        int[] numbers = new int[] {0, 1, 3, 4, 5, 7, 8, 9};

        int answer = 0;
        int result = 0;

        for (int i = 0; i < numbers.length; i++){
            result += numbers[i];
        }
        answer = 45 - result;

        System.out.println(answer);
    }
}

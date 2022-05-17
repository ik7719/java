package new_prac;

public class Temp_test {
    public static void main(String[] args){
        int[] arr1 = new int[] {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = new int[] {23, 23, 30, 28, 30, 23, 23};

        int answer = 0;

        for(int i = 0; i < arr1.length; i++){
            if(arr2[i] >= 29){
                arr2[i] = 21;
                System.out.println(arr2[i]);
            } else {
                System.out.println(arr2[i]);
            }
            answer += arr1[i] - arr2[i];
        }
        answer = Math.abs(answer);
        System.out.println(answer);
    }
}

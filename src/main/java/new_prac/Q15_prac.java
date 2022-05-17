package new_prac;

public class Q15_prac {
    public static void main(String[] args){
        int[] a = new int[] {1, 2, 3, 4};
        int[] b = new int[] {-3, -2, 1, -8};

        int result = 0;

        for(int i = 0; i < a.length; i++){
                result += a[i] * b[i];
            }
        System.out.println(result);
    }
}

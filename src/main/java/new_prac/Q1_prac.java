package new_prac;

public class Q1_prac {
    public static void main(String[] args){
        int n = 5;
        int m = 3;

        int i;
        int j;

        for(i = 0; i < m; i ++){ // 별 5개를 3줄로
            for(j = 0; j < n; j++){ // 1열에 행 5개
                System.out.print("*");
            }
            System.out.println(); // 개행만 하기 위함.
        }
    }
}

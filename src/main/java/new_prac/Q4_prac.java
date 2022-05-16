package new_prac;

public class Q4_prac {

    public static void main(String[] args){

        int answer = 0;

        int a = 3;
        int b = 5;

        for(int i = Math.min(a, b); i <= Math.max(a , b); i++){ // 습관적 '<' 주의
            answer += i;
        }
        System.out.println(answer);
    }
}

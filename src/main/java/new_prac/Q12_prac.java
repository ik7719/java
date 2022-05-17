package new_prac;

public class Q12_prac {
    public static void main(String[] args){

        int price = 300;
        long money = 600;
        int count = 4;

        long sum = 0;
        long result = 0;

        for(int i = 1; i <= count; i++){
            sum += price * i;
        }
        result = Math.abs(money - sum); // 절대값

        System.out.println(result);
    }

}

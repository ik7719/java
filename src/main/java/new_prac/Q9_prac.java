package new_prac;

public class Q9_prac {
    public static void main(String[] args) {
        String answer = "";
        String phone_number = "01012349999";

        String[] numberArr = phone_number.split("");
        for (int i = 0; i < numberArr.length; i++) {

            if (i < numberArr.length - 4) {
                answer += "*";
            } else {
                answer += numberArr[i];
            }
        }
        System.out.println(answer);
    }
}

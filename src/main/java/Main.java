import java.util.ArrayList;

public class Main {
    public String solution(int n) {
        String answer = "";

        int result = 0;

        String num = Integer.toString(n);

        ArrayList<Integer> intList = new ArrayList<Integer>();

        for (int i = 5; i >= 0; i--) {
            intList.add(num.charAt(i) - '0');
        }

        for(int j = 0; j < intList.size(); j++){
            result += intList.get(j);
        }

        answer =  "\""  + (intList.get(0)) + "+" + intList.get(1) + "+" + intList.get(2) + "+" + intList.get(3) + "+"+ intList.get(4) + "+" + intList.get(5) + "=" + result + '"';

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(718253));
    }
}
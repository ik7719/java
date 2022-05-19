import java.util.ArrayList;
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine(); // index값을 위해 string으로 입력받는다.

        String str = "";
//        long str = 0;

        ArrayList list = new ArrayList(); // list

        for (int i = 0; i < x.length(); i++) {
            list.add(x.charAt(i));
        }

        for (int j = 0; j < x.length(); j++) {
            str += list.get(j);
            // 하나씩 뽑아내는데 정수로 바꿔주고 뽑아야 돼.
        }

        System.out.println(str);
    }
}
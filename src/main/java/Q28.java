import java.util.ArrayList;
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine(); // index값을 위해 string으로 입력받는다.

        String result = "";

        ArrayList list = new ArrayList(); // list

        for (int i = 0; i < x.length(); i++) {
            list.add(x.charAt(i));
        }

        System.out.println(list);
    }
}
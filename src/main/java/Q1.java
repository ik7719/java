import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        String star = "";

        for(int i = 0; i < n; i++){
            star += "*";
        }
        for(int i = 0; i < m; i++) {
            System.out.println(star);
        }
    }
}
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String result = "";

        double b = scan.nextInt();

        double a = b / 2 ;

        if(a % 2 == 0){
            result = "Even";
        } else {
            result = "Odd";
        }
        System.out.println(result);
    }
}

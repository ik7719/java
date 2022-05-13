import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double b = scan.nextInt();

        double a = b / 2 ;

        if(a == 0){
            System.out.println("odd");
        } else {
            System.out.println("Even");
        }
    }
}

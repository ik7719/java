package new_prac;

public class Q3_prac {

        public static void main(String args[]){

            String s = "lastDayOfWeek"; // string타입은 각각의 index 값을 지니고 있음.
            int strNum = s.length();
            int reEven = strNum / 2;

            if(strNum % 2 == 0){
                System.out.print(s.charAt(reEven - 1));
                System.out.println(s.charAt(reEven));
            } else {
                System.out.println(s.charAt(reEven));
            }


    }
}

package new_prac;

public class Q7_prac {
    public static void main(String[] args){

        int[] absolutes = new int[] {1, 2, 3};
        boolean[] signs = new boolean[] {true, false, true};
        int answers = 0;

        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]){
                answers += absolutes[i];
            } else {
                answers -= absolutes[i];
            }

        } System.out.println(answers);
    }

}

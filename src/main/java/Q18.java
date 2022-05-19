public class Q18 {
    public static void main(String[] args){
        String[] seoul = new String[] {"Jane", "Kim"};
        String answer = "";



        for(int i = 0; i < seoul.length; i++){
            answer = seoul[i];
            if(answer == "kim"){
                System.out.println("김서방은 " + i + "에 있다");
            }
        }
    }
}

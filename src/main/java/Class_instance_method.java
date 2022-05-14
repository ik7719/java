class Calculation { // 인스턴스
    int add(int x, int y){
        return x + y;
    }
    int subtract(int x, int y){
        return x - y;
    }
}

public class Class_instance_method {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        // 인스턴스  / 지역 변수 / = 새로운 인스턴스();

        int addResult = calculation.add(100, 90);
        int subResult = calculation.subtract(90, 70);
        // 서로 다른 메소드라면 같은 이름의 지역변수를 선언해서 사용해도 됨

        System.out.println("두 개를 더한 값은 " + addResult);
        System.out.println("두 개를 뺀 값은 " + subResult);


    }
}
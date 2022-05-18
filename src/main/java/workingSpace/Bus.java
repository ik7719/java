package workingSpace;

import java.util.UUID;

public class Bus {
    public static void main(String[] args){
        System.out.println("객체 생성시 번호는 고유값으로 생성되어야 합니다.");
        System.out.println("uuid - 고유 값을 표현할 수 있는 객체입니다 (32개 문자와 하이픈 포함한 총 36개값)");
        System.out.println("start, center, end 부분에 생성하려는 데이터 값을 삽입하시면 됩니다");

        String start = "20210203075533";
        String center = "서울 70 사 5705"; // 특정 고유값 지정
        String end = "uuidcodesample";

        UUID uuid = new UUID(start.hashCode(), ((long) center.hashCode() << 32) | end.hashCode());
        String uuidResult = uuid.toString();

        System.out.println("UUID : "+uuidResult);

        System.out.println("버스 번호 : " + center);

        Bus b1 = new Bus(); // 새로운 객체 생성



    }

}

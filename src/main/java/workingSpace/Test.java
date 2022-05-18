package workingSpace;

import java.util.UUID;

public class Test {
    public static void main(String[] args){
//        System.out.println("객체 생성시 번호는 고유값으로 생성되어야 합니다.");
//        System.out.println("uuid - 고유 값을 표현할 수 있는 객체입니다 (32개 문자와 하이픈 포함한 총 36개값)");
//        System.out.println("start, center, end 부분에 생성하려는 데이터 값을 삽입하시면 됩니다");

        String start = "20210203075533";
        String center = "서울 70 사 5705"; // 특정 고유값 지정
        String end = "uuidcodesample";

        UUID uuid = new UUID(start.hashCode(), ((long) center.hashCode() << 32) | end.hashCode());
        String uuidResult = uuid.toString();

//        System.out.println("UUID : "+uuidResult);

        Bus bus5705 = new Bus(5705); // Bus라는 객체 생성를 생성하고 객체를 참고하는 'bus5705'라는 변수 선언

        Passenger pas1 = new Passenger("kelly");
        Passenger pas2 = new Passenger("ally");
        Passenger pas3 = new Passenger("array");
        Passenger pas4 = new Passenger("jo");
        Passenger pas5 = new Passenger("code");

        pas1.takeBus(bus5705); // pas1. 버스 탑승 요청
        pas2.takeBus(bus5705);
        pas3.takeBus(bus5705);
        pas4.takeBus(bus5705);
        pas5.takeBus(bus5705);

        pas1.showInfo(); // pas1 승객 정보
        bus5705.showInfo(); // 버스 정보



    }
}

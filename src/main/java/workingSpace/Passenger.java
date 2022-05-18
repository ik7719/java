package workingSpace;

public class Passenger {
    String name;

    public Passenger(String name){
        this.name = name;
    }

    public void takeBus(Bus bus){ // 탑승 요청하면 여기로
        bus.take(1);
    }

    public String getName(){
        return name;
    }

    public void showInfo(){
        System.out.println(getName() + " 가 버스에 탑승했습니다.");
    }
}

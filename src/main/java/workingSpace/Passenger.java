package workingSpace;

public class Passenger {
    String name;

    public Passenger(String name){
        this.name = name;
    }

    public boolean takeBus(Bus bus){
        if(bus.checkBus() == "운행" && bus.checkPas()){ // 확인 완료
            bus.take(1);
            return true;
        } else {
            System.out.println("더 이상 탑승하실 수 없습니다.");
            return false; // else면 여기서 class를 종료하도록
        }
    }

    public String getName(){
        return name;
    }

    public void showInfo(){
        System.out.println(getName() + " 가 버스에 탑승했습니다. ");
    }
}

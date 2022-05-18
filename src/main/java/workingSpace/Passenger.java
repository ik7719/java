package workingSpace;

public class Passenger {
    String name;
    String condition;

    public Passenger(String name){
        this.name = name;
    }

    public boolean takeBus(Bus bus){
        if(bus.checkBus() == "운행"){
            bus.take(1);
            return true;
        } else {
            return false; // else면 여기서 class를 종료하도록
        }
    }

    public String getName(){
        return name;
    }

    public void showInfo(){
        System.out.println(getName() + " 가 버스에 탔습니다. ");
    }
}

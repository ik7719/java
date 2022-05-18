package workingSpace;

public class Passenger {
    String name;

    public Passenger(String name){
        this.name = name;
    }

    public void takeBus(Bus bus){
        bus.take(1);
    }

    public String getName(){
        return name;
    }

    public void showInfo(){
        System.out.println(getName() + " 가 버스에 탔습니다. ");
    }
}

package workingSpace;

import java.util.UUID;

public class Bus {
    int Num; // 번호
    int oil; // 주유량
    int passenger; // 탑승객
    String run; // 운행중
    String stopRun; // 미운행

    public Bus(int num){
        this.Num = num;
    }

    public void take(int passenger){
        this.passenger++;

    }

    public int getNum(){
        return Num;
    }

    public int getPassenger(){
        return passenger;
    }

    public String drive(){
        run = "운행중입니다.";
        return run;
    }

    public void showInfo(){
        System.out.println("버스 " + this.getNum() + "의 탑승객은 " + this.getPassenger() + "명입니다.");
        System.out.println("버스 " + this.getNum() + "은 현재 " + this.drive());
    }

}

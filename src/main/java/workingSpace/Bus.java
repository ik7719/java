package workingSpace;

import java.util.UUID;

public class Bus {
    int Num; // 번호
    int oil; // 주유량
    int passenger; // 탑승객

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

    public void showInfo(){
        System.out.println("Bus " + this.getNum() + " got " + this.getPassenger() + " passengers");
    }

}

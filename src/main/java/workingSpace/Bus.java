package workingSpace;

import java.util.UUID;

public class Bus {
    int Num; // 번호
    double oil = 11; // 주유량
    int passenger = 0; // 탑승객
    String run; // 운행중
    String stop; // 미운행

    public Bus(int num){
        this.Num = num;
    }

    public String checkBus(){ // 확인 완료
        if(oil < 10){
            stop = "차고지행";
            return stop;
        } else {
            run = "운행";
            return run;
        }
    }

    public void take(int passenger){ // 'this.'가 뭔지 다시 찾아봐.
        passenger++;
    }

    public boolean checkPas(){
        if(passenger < 5){
            return true;
        } else {
            return false;
        }
    }

    public int getNum(){
        return Num;
    }

    public int getPassenger(){
        return passenger;
    }

    public void showInfo(){
        System.out.println("버스 " + this.getNum() + "의 탑승객은 " + this.getPassenger() + "명입니다.");
        System.out.println("버스 " + this.getNum() + "은 현재 " + this.checkBus() + " 중 입니다.");
    }

}

package workingSpace;

import java.util.UUID;

public class Bus {
    int Num; // 번호
    double oil = 9; // 주유량
    int passenger; // 탑승객
    int pasMax = 4;
    int pasNow = 0;
    String run; // 운행중
    String stop; // 미운행
    String pasPos; // 탑승 가능
    String pasImp; // 탑승 불가능

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
        if(pasNow <= pasMax){
            pasNow += passenger;
        }
    }

    public String checkPas(){
        if(pasNow <= pasMax){
            pasPos = "탑승 가능";
            return pasPos;
        } else {
            pasImp = "탑승 불가능";
            return pasImp;
        }
    }

    public int getNum(){ // 버스 번호 get
        return Num;
    }

    public int getPassenger(){ // 탑승한 인원
        if(checkBus() == stop){
            pasNow = 0;
            System.out.println("주유가 필요합니다.");
            return pasNow;
        }
        return pasNow;
    }

    public void showInfo(){
        System.out.println("버스 " + this.getNum() + "의 탑승객은 " + this.getPassenger() + "명입니다.");
        System.out.println("버스 " + this.getNum() + "의 상태는 현재 " + this.checkBus() + " 입니다.");
    }

}

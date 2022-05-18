package workingSpace;

import java.util.UUID;

public class Bus {
    int Num; // 번호
    double oil = 11; // 주유량
    int passenger; // 탑승객
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
        pasNow += passenger;
        System.out.println(pasNow);
    }

    public String checkPas(){
        if(pasNow < 5){
//            return true;
            pasPos = "탑승 가능";
            return pasPos;
        } else {
//            return false;
            pasImp = "탑승 불가능";
            return pasImp;
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

package workingSpace;

import java.util.UUID;

public class Bus {
    int Num; // 번호
    double oil = 11; // 주유량
    int passenger; // 탑승객
    String run; // 운행중
    String stop; // 미운행

    public Bus(int num){
        this.Num = num;
    }

    public String checkBus(){
        if(oil < 10){
            stop = "차고지행";
            return stop;
        } else {
            run = "운행";
            return run;
        }
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



//    public Double checkOil(){
//        oil = 10;
//        if(oil < 10){
//            System.out.print("주유량을 확인해 주세요.");
//        }
//        return oil;
//    }

    public void showInfo(){
        System.out.println("버스 " + this.getNum() + "의 탑승객은 " + this.getPassenger() + "명입니다.");
        System.out.println("버스 " + this.getNum() + "은 현재 " + this.checkBus());
//        System.out.println("버스 " + this.getNum() + "의 주유량은 현재 " + this.checkOil() + "L 입니다.");
    }

}

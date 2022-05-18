//package workingSpace;
//
//public class BusMethod {
//
//    public int inCar() {
//        int count = 0;
//
//        for(int i = 0; i < bus.MaxPassenger; i++){
//            if(NowPassenger >= MaxPassenger){
//                System.out.println("더 이상 탑승할 수 없습니다.");
//                break;
//            } else {
//                count += i;
//            }
//        }
//    }
//    public void method1() { // 매겨변수 X
//        System.out.println("m1이 실행됨.");
//    }
//
//    public void method2(int x) { // 실행하고 결과값을 돌려주지 않는다.
//        System.out.println(x + "를 이용한 m2 실행");
//    }
//
//    public int method3() { // 값을 반환해줘야 한다.
//        System.out.println("m3 실행");
//        return 10;
//    }
//
//    public void method4(int x, int y) {
//        System.out.println(x + y + "method4 실행");
//    }
//
//    public int method5(int y) {
//        System.out.println(y + "이용한 m5 실행");
//        return y * 2;
//    }
//}

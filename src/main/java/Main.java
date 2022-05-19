public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(11, 20, 10, 30, 1500, 1000);

        taxi.drive();
        taxi.ride();
        taxi.speedChange();
        taxi.addFee();
        taxi.payFee();

    }
}
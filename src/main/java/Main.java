public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(9, 20, 30, 30, 1500, 1000);

        taxi.drive();
        taxi.ride();
        taxi.speedChange();
        taxi.addFee();
        taxi.payFee();

    }
}
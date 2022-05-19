public class Taxi {
    private int taxiNumber; //타입 뭘로할까?
    private int fuel;
    private double currentSpeed;
    private String goal;
    private double distance;
    private double goalDistance;
    private int fee;
    private int distanceFee;

    public Taxi(int fuel, double currentSpeed, double distance, double goalDistance, int fee, int distanceFee){
        this.fuel = fuel;
        this.currentSpeed = currentSpeed;
        this.goal = "영월";
        this.distance = distance;
        this.goalDistance = goalDistance;
        this.fee = fee;
        this.distanceFee = distanceFee;
    }


}

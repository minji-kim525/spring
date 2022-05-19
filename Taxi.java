package assignment1;

public class Taxi{
    private static int serialNum2=0;
    private int taxiNumber;
    private int gasOfamount=100;
    private int feePerDistance=1000;
    private int fee=3000;
    private int destinationDistance;
    private int distance;
    private String state;//운행, 일반, 불가;
    private int speed;
    private String destination;
    private int passenger;
    // 목적지, 현재속도, 기본거리, 목적지까지 거리, 기본 요금,거리당 요금, 상태(운행 중, 일행)


    public int getFee() {
        return fee;
    }

    public static int getSerialNum2() {
        return serialNum2;
    }

    public int getTaxiNumber() {
        return taxiNumber;
    }

    public int getGasOfamount() {
        return gasOfamount;
    }

    public void setGasOfamount(int gasOfamount) {
        this.gasOfamount += gasOfamount;
    }

    public int getFeePerDistance() {
        return feePerDistance;
    }

    public void setFeePerDistance(int feePerDistance) {
        this.feePerDistance = feePerDistance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
        System.out.println("목적지까지 거리: "+ distance+"km");
    }

    public String getState() {
        return state;
    }
    public int getSpeed() {
        return speed;
    }
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
        System.out.println("목적지: "+ destination);
    }

    public int getPassenger() {
        return passenger;
    }

    public Taxi(){
         serialNum2++;
         taxiNumber= serialNum2;
         this.state="일반";
     }
    //운행시작 주유 상태 10이상이어야 운행 가능
    public void runStart() {
        if (this.gasOfamount >= 10) {
            this.state = "일반";
            System.out.println("운행을 시작합니다.");
        } else {
            this.state = "불가";
            System.out.println("운행이 불가능합니다.");
        }
    }
    public void take(int passenger){
          if(this.state.equals("일반")) {
              this.passenger+=passenger;
              System.out.println("탑승 승객 수:"+this.passenger);
              this.state = "운행";
          }else{
              System.out.println("탑승 불가");
          }
    }
    public void changeSpeed(int speed){
        if(this.gasOfamount<10) {
            System.out.println("주유량을 확인해 주세요");
        }else{
            this.speed+=speed;
            System.out.println("속도가"+speed+"로 변경됩니다.");
        }
    }
    public void feeAdd(){
        if(this.distance>1) {
            //기본거리 1km로 산정
            //거리당 요금=1000
            this.feePerDistance= (this.distance-1)*1000;
            System.out.println("거리당 추가 요금은 "+this.feePerDistance+"원 입니다.");

        }
    }
    public void payment(){
        int i;
        i=this.feePerDistance+3000;//1키로당 1000;
        System.out.println("결제 요금은 "+i+"원 입니다.");
    }


}

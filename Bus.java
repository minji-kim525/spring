package assignment1;

public class Bus {
    private static int serialNum=1000;
    private int busNumber;
    private int gasOfamount=100;
    private int fee=1000;
    private String state;//운행 , 차고지행
    private int maxPassenger=30;
    private int currentPassenger;
    private int speed;
    // 멤버 변수 정의

    // 생성시 최초 상태 운행상태
    public Bus() {
        serialNum++;
        busNumber=serialNum;
        this.state = "운행";
    }

    public int getCurrentPassenger() {
        return currentPassenger;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public int getGasOfamount() {
        return gasOfamount;
    }

    public void setGasOfamount(int gasofamount) {
        this.gasOfamount +=gasofamount;
        System.out.println("현재 주유량은 "+this.getGasOfamount()+" 입니다.");
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void isState() {
        if(this.state.equals("운행"))
            System.out.println("현재 버스는 운행 중입니다.");
        else
            System.out.println("현재 버스는 차고지행입니다.");

    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    //승객 탑승은 '최대 승객수' 이하까지 가능, 운행 중인 상태의 버스만 가능
    public void take(int passenger){
        if(maxPassenger>this.currentPassenger+passenger&&this.state.equals("운행")){
            this.currentPassenger+=passenger;
            System.out.println("현재 탑승 승객 수: "+this.currentPassenger);
            System.out.println("잔여 승객 수: "+ (this.maxPassenger-this.currentPassenger));
            System.out.println("요금: "+ (passenger*fee));
        }else{
            System.out.println("최대 승객 수를 초과하였습니다.");
            System.out.println("현재 탑승 승객 수: "+this.currentPassenger);

        }
    }
    // 주유량이 10미만일 때 운행 상태를 차고지 행으로 변경
    public void changeState(){
        if(this.gasOfamount<10){
            this.state="차고지행";
            System.out.println("주유가 필요합니다.");

        }else{
            System.out.println("현재 주유량은"+this.gasOfamount+"입니다.");
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

    // 최대 승객수, 현재 승객수, 현재속도, 상태 운행, 차고지행
}

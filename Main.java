package assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int exit = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("버스는 1 택시는 2를 입력하세요");
        int choose = scanner.nextInt();
        if (choose == 1) {
            Bus bus1 = new Bus();
            Bus bus2 = new Bus();

            while (exit != -1) {
                System.out.println("1인 요금: " + bus1.getFee() + "원, 버스 번호: " + bus1.getBusNumber());
                System.out.println("1. 운행 2. 승객 탑승 3. 속도 변경 4. 상태 변경 5. 주유량 입력 종료(-1)");
                int answer = scanner.nextInt();
                switch (answer) {
                    case 1:
                        bus1.isState();
                        break;
                    case 2:
                        System.out.println("몇 명을 태울지 입력하세요");
                        int n = scanner.nextInt();
                        bus1.take(n);
                        break;
                    case 3:
                        System.out.println("변경할 속도를 입력하세요");
                        int speed = scanner.nextInt();
                        bus1.changeSpeed(speed);
                        break;
                    case 4:
                        bus1.changeState();
                        break;

                    case 5:
                        System.out.println("주유량을 입력하세요");
                        int gasofamount = scanner.nextInt();
                        bus1.setGasOfamount(gasofamount);
                        break;
                    default:
                        exit = -1;
                }
            }
        } else {
            Taxi taxi1 = new Taxi();
            Taxi taxi2 =new Taxi();
            while (exit != -1) {
                System.out.println("기본 요금: "+ taxi1.getFee() + "원, 택시 번호: " + taxi1.getTaxiNumber());
                System.out.println("1. 운행 시작 2. 승객 탑승 3. 목적지 입력 4. 속도 변경 5. 요금 결제 6. 주유량 입력  종료(-1)");
                int answer = scanner.nextInt();
                switch (answer) {
                    case 1:
                        taxi1.runStart();
                        break;
                    case 2:
                        System.out.println("몇 명을 태울지 입력하세요");
                        int n = scanner.nextInt();
                        taxi1.take(n);
                        break;
                    case 3:
                        System.out.println("목적지를 입력하세요");
                        String destination = scanner.next();
                        System.out.println("목적지까지 거리를 입력하세요(단위: m)");
                        int distance = scanner.nextInt();
                        taxi1.setDestination(destination);
                        taxi1.setDistance(distance);
                        break;
                    case 4:
                        System.out.println("변경할 속도를 입력하세요");
                        int speed = scanner.nextInt();
                        taxi1.changeSpeed(speed);
                        break;
                    case 5:
                        System.out.println("목적지에 도착했습니다.");
                        taxi1.feeAdd();
                        taxi1.payment();
                        break;
                    case 6:
                        System.out.println("주유량을 입력하세요");
                        int gasofamount = scanner.nextInt();
                        taxi1.setGasOfamount(gasofamount);
                        break;
                    default:
                        exit = -1;
                }
            }

        }
    }
}
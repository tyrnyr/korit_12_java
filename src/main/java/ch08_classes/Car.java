package ch08_classes;

public class Car {
    // 필드 선언
    String color;
    int speed;

    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public void drive() {
        System.out.println(color+" 자동차가 " + "주행중입니다.");
    }

    public void brake() {
        System.out.println(color+" 자동차가 " + "멈췄습니다.");
    }

    public void displayInfo() {
        System.out.println("이 차의 색깔은 " + color + "색이고,");
        System.out.println("최고 속도는 " + speed + "km/h입니다.");
    }

    /*
            Car의 인스턴스인 myCar라는 객체를 생성하시오.
            color 빨강, speed에 160을 대입하시오.
            yourCar에 노랑, 180을 대입하시오.
            myCar는 drive()
            yourCar는 brake()
            각각 displayInfo()
     */

    // 매서드 정의
}

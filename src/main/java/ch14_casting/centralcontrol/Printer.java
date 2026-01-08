package ch14_casting.centralcontrol;

public class Printer implements Power{
    @Override
    public void on() {
        System.out.println("프린터가 동작합니다.");
    }

    @Override
    public void off() {
        System.out.println("프린터가 종료되었습니다.");
    }

    public void print() {
        System.out.println("프린터를 인쇄합니다.");
    }
}

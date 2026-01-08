package ch13_abstraction.interfaces;

public class VolumUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("볼륨을 한 칸 올립니다.");
    }

    @Override
    public String onUp() {
        return "볼륨을 계속 올립니다";
    }
}

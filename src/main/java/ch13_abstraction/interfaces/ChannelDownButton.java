package ch13_abstraction.interfaces;

// channelUpButton을 생성하고 적절하게 메서드를 채워 넣으시오.
public class ChannelDownButton extends Button{

    @Override
    public void onPressed() {
        System.out.println("채널을 한칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("채널을 계속 내립니다.");
    }
}

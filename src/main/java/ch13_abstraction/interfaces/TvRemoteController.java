package ch13_abstraction.interfaces;

public class TvRemoteController {
    // field 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumUpButton volumUpButton;
    private VolumDownButton volumDownButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton) {
        System.out.println("Tv 리모컨 객체가 생성되었습니다.");
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
    }

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumUpButton volumUpButton, VolumDownButton volumDownButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumUpButton = volumUpButton;
        this.volumDownButton = volumDownButton;
    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressdChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressdChannelUpButton() {
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        System.out.println(channelUpButton.onUp());
    }

    public void onPressdVolumUpButton() {
        volumUpButton.onPressed();
    }
    public void onUpVolumUpButton() {
        System.out.println(volumUpButton.onUp());
    }
    public void onPressdVolumDownButton() {
        volumDownButton.onPressed();
    }
    public void onDownVolumDownButton() {
        volumDownButton.onDown();
    }
    /*
        onPressdChannelDownButton() 메서드와
        onDownChannelDownButton() 메서드를 정의하시오
        정의 방식을 이상을 참조할 것
        main에서 tvRemoteController.onPressdChannelDown();
        main에서 tvRemoteController.onDownChannelDown();
        메서드들을 호출하시오
        실행 예
        Tv 리모컨 객체가 생성되었습니다.
        전원을 켭니다.
        채널을 한칸 내립니다.
        채널을 계속 내립니다.
        볼륨을 한 칸 내립니다.
        볼륨을 계속 내립니다.
        볼륨을 한 칸 올립니다.
        볼륨을 계속 올립니다.
        전원을 끕니다.
     */
}
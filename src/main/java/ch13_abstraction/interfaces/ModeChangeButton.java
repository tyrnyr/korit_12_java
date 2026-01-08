package ch13_abstraction.interfaces;

public class ModeChangeButton extends Button {
    boolean status = false;

    @Override
    public void onPressed() {
        if(status) {
            status = false;
            System.out.println("냉방으로 바뀝니다.");
        } else {
            status = !status;
            System.out.println("난방으로 바뀝니다.");
        }
    }
}

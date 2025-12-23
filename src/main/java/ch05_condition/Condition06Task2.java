package ch05_condition;

import java.util.Scanner;
/*
        Conditon05Task에서 고민해봐야 할 사항이 있습니다.
        예를 들어서 129038 입력하면 A가 나오긴 하겠네요.
        즉 100 초과 / 0 미만의 점수가 입력됐을때 A / F라는 결과값이 나오게 됩니다.
        애초에 잘못된 점수를 입력했을 때 불가능한 점수 입력이라고
        안내를 하려면 어떻게 할 수 있을까요?
        100 초과 / 0 미만의 점수에 대해 grade를 x라고 가정하겠습니다.
 */
public class Condition06Task2 {
    public static void main(String[] args) {

        int score;
        String grade;

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.print("점수를 입력하시오 >>> ");

            score = scanner.nextInt();

            if(score >= 100 || score < 0) {
                System.out.println("값이 잘못 입력되었습니다. 다시 입력해주세요.");

            } else {
                if(score > 89) {
                    grade = "A";
                } else if(score > 79) {
                    grade = "B";
                } else if(score > 69) {
                    grade = "C";
                } else if(score > 59) {
                    grade = "D";
                } else {
                    grade = "F";
                }

                System.out.println("점수는 "+ score + "점이고, 학점은 " + grade +"입니다");
                break;
            }
        }
    }
}

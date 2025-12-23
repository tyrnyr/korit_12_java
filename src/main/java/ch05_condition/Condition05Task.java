package ch05_condition;

import java.util.Scanner;

public class Condition05Task {
    public static void main(String[] args) {
        /*
                사용자에게 score를 입력받아 다음과 같은 조건을 만족시키도록 작성하시오
                score가 90점 이상이라면 grade는 A
                score가 80점 이상이라면 grade는 B
                score가 70점 이상이라면 grade는 C
                score가 60점 이상이라면 grade는 D
                score가 59점 이하ㅣ면 grade는 F
         */
        Scanner scanner = new Scanner(System.in);
        int score;
        String grade ="";
        String name;

        System.out.print(" 점수를 입력하세요 >>> ");
        score = scanner.nextInt();
        System.out.print(" 이름을 입력하세요 >>> ");
        name = scanner.next();

        if(score >= 90) {
            grade = "A";
        } else if(score >= 80) {
            grade = "B";
        } else if(score >= 70) {
            grade = "C";
        } else if(score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(name+"학생의 점수는 "+ score+"점이고, 학점은 " + grade +"입니다");
    }
}


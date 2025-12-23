package ch05_condition;

import java.util.Scanner;

public class Condition12Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice;

        System.out.println(" [ 메뉴 선택 ] ");
        System.out.println("a. Java를 공부한다");
        System.out.println("b. JavaScirpt를 공부한다");
        System.out.println("c. Pyton를 공부한다");
        System.out.println("d. HTML를 공부한다");
        System.out.println("e. 자습한다");
        System.out.println("f. 쉰다");
        System.out.print("메뉴를 선택하시오 >>> ");
        choice = scanner.nextLine();

        // switch문으로 작성시
        switch(choice) {
            case "a" :
                System.out.println("메뉴 1을 선택하였습니다.");
                break;
            case "b" :
                System.out.println("메뉴 2을 선택하였습니다.");
                break;
            case "c" :
                System.out.println("메뉴 3을 선택하였습니다.");
                break;
            case "d" :
                System.out.println("메뉴 4을 선택하였습니다.");
                break;
            case "e" :
                System.out.println("메뉴 5을 선택하였습니다.");
                break;
            case "f" :
                System.out.println("메뉴 6을 선택하였습니다.");
                break;
            default :
                System.out.println("불가능한 선택 메뉴입니다.");
        }
    }
}

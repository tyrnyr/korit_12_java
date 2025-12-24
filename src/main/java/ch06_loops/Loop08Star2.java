package ch06_loops;
/*
    Scanner를 이용한 별찍기

    실행 예
    몇 줄의 별을 생성하시겠습니까? >>> 3
    *
    **
    ***
    로 만들어질 수 있도록 작성하시오.
    다하신분은
    ***
    **
    *

 */

import java.util.Scanner;

public class Loop08Star2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        int line = scanner.nextInt();
        scanner.nextLine();
        System.out.print("사용할 모양을 적어주세요 >>> ");
        String starShape = scanner.nextLine();

        System.out.println();
        System.out.println("-----증가 별찍기입니다-----");
        for(int i = 1 ; i < line+1 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(starShape);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("-----감소 별찍기입니다-----");
        for(int i = line ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(starShape);
            }
            System.out.println();
        }
    }
}

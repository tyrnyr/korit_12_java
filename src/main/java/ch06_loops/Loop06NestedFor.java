package ch06_loops;

import java.util.Scanner;

/*
        중첩 for문도 가능합니다.
        for ( int i = 0 ; i < 100 ; i++) {
            반복실행문 1-a
            for ( int j = 0 ; j < 100 ; j++) {
                반복실행문 2
            }
            반복실행문 1-b
        }
        for 문을 활용하여 1일차 1교시입니다. 5일차 3교시입니다 출력
        다하면 구구단 for문으로
 */
public class Loop06NestedFor {
    public static void main(String[] args) {

//        for(int i = 1 ; i < 6 ; i++) {
//            for(int j = 1 ; j < 4 ; j++) {
//                System.out.println(i+ "일차 " + j + "교시 입니다." );
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for(int i = 2 ; i < 10 ; i++) {
//            for(int j = 1 ; j < 10 ; j++) {
//                System.out.println(i+ " X " + j + " = " + (i*j));
//            }
//            System.out.println();
//        }
//
//        for(int i = 0 ; i < 10 ; i++) {
//            for(int j = 1 ; j < 11 ; j++) {
//                System.out.print((i*10+j) + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();

        /*
            숫자를 입력 받아서 1부터 홀수만 더하는 for 반복문을 작성하시오.
            다했으면 1부터 짝수만 더하는 for 반복문을 작성하시오.
         */

        int oddSum = 0;
        int evenSum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇 까지 더하시겠습니까? >>> ");
        int maxNum = scanner.nextInt();

        for(int i = 0 ; i < maxNum+1 ; i++) {
            if(i%2==1) oddSum+=i;
            else evenSum+=i;
        }
        System.out.println("1부터 "+ maxNum +"까지 홀수의 합은 " + oddSum + "입니다.");
        System.out.println("1부터 "+ maxNum +"까지 짝수의 합은 " + evenSum + "입니다.");

    }
}

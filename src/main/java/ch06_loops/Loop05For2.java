package ch06_loops;

import java.util.Scanner;

public class Loop05For2 {
    public static void main(String[] args) {
        // 1부터 100까지의 숫자 중 홀수 합만 구하는 for문을 작성하시오
        // 힌트 # 1 : for문 내에 if가 들어갈 수 있음.
        // 힌트 # 2 : 근데 if문 안쓰고도 홀수 합만을 구하는것이 가능하긴함.

        int oddSum = 0;
        int oddSum2 = 0;

        for(int i = 1 ; i < 101 ; i++) {
            if(i%2 == 1) {
                oddSum += i;
            }
        }
        System.out.println("1~100까지 홀수의 합은 " + oddSum);

        System.out.println();

        for(int j=1 ; j < 101 ; j+=2) {
            oddSum2 += j;
        }
        System.out.println("1~100까지 홀수의 합은 " + oddSum2);
        System.out.println();
        /*
            여러분들이 숫자 관련 변수를 볼 때 i를 보는 경우가 많습니다.
            i는 index의 축약어로 쓰입니다. 그 뒤 알파벳 j, k... 으로 중첩 반복문에서 변수명으로 선호되는
            숫자를 입력받아서 1부터 n까지 더하는 반복문을 작성하겠습니다.
            1부터 몇까지 더하겠습니까 >> 10
            1부터 10까지의 합은 55입니다.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
        int maxNum = scanner.nextInt();
        int sum3 = 0;
        for(int i = 1 ; i < maxNum+1 ; i++) {
            sum3 += i;
        }
        System.out.println("1부터 " + maxNum + "까지의 합은 " + sum3 + "입니다");


        int sum4 = 0;
        sum4 = ((maxNum)*(maxNum+1))/2;
        System.out.println("1부터 " + maxNum + "까지의 합은 " + sum4 + "입니다");

    }
}

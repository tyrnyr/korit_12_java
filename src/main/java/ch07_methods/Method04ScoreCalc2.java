package ch07_methods;

import java.util.Scanner;

public class Method04ScoreCalc2 {
    // method 정의 영역 - 이전의 메서드03에서 정의한 방식은 하나의 메서드에 총합을 구하는 메서드와
    // 평균을 구하는 메서드가 합쳐져 있었습니다.

    // 이번 단계에서는 1. 합을 구하는 메서드 / 2. 평균을 구하는 메서드를 작성하고
    // 평균을 구하는 메서드 내에서 합을 구하는 메서드를 호출하는 방식으로 작성할겁니다.

    // 그리고 메서드 호출 영역에는 '평균을 구하는 메서드'만 호출할겁니다.

    static int totalSubs= 0;

    //1. 합을 구하는 메서드
    public static double calcSum() {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 개의 과목을 입력하시겠습니까? >>> ");
        int numOfSubs = scanner.nextInt();
        totalSubs = numOfSubs;
        for(int i = 0; i < numOfSubs ; i++) {
            System.out.print((i+1)+ " 과목의 점수를 입력하시오. >>> ");
            sum += scanner.nextInt();
        }
        return sum;
    }

    //2. 평균을 구하는 메서드
    public static void calcAvg() {
        double sum = calcSum();

        System.out.println(totalSubs + " 과목의 평균 점수는 " + (sum/totalSubs) + "입니다.");
    }

    //1. 합을 구하는 메서드
    public static double calcSum2(int num) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        for(int i = 0; i < num ; i++) {
            System.out.print((i+1)+ " 과목의 점수를 입력하시오. >>> ");
            sum += scanner.nextInt();
        }
        return sum;
    }

    //2. 평균을 구하는 메서드
    public static void calcAvg2() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 과목을 입력하시겠습니까? >>> ");
        int numOfSubs = scanner.nextInt();
        double sum = calcSum2(numOfSubs);

        System.out.println(numOfSubs + " 과목의 총합은 " + sum + "이고, 평균 점수는 " + (sum/numOfSubs) + "입니다.");
    }

    public static void main(String[] args) {
//        calcAvg();
        calcAvg2();
    }
}

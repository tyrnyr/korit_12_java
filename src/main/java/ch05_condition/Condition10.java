package ch05_condition;
/*
    삼항 연산자
        정의 : 조건식을 평가하여 true / false에 따라 두가지 표현식 중 하나를 선택적으로 실행
        형식 :
        조건식 ? 표현식1 : 표현식2

        조건식 : true / false로 평가 가능한 식
        표현식1 : 조건식이 true일 때 실행
        표현식2 : 조건식이 false일 때 실행
 */

import java.util.Scanner;

public class Condition10 {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 3;
//        int max;
//
//        max = a > b ? a : b;
//
//        System.out.println("max에 저장된 값 : " + max);

//         근데 이거 아까 배운 조건문 쓴다고 가정해보겠습니다.
//        if(a>b) max = a;
//        else max = b;
//
//        System.out.println("max에 저장된 값2 : " + max);

        Scanner scanner = new Scanner(System.in);

        System.out.print("연도를 입력하시오 >>> ");
        int year = scanner.nextInt();
//        boolean leapYear = ((year%4 == 0) && (year%100 != 0)) || (year%400 == 0);
//        String result = leapYear ? "윤년입니다" : "윤년이 아닙니다";
//        System.out.println((year+"년은"+result));

        // 이제 음수를 걸러내는 부분 추가
//        String result2 = "";
//        boolean leapYear2 = ((year%4 == 0) && (year%100 != 0)) || (year%400 == 0);
//        if(year < 0) {
//            System.out.println("입력할수 없는 연도입니다.");
//
//        } else {
//            result2 = leapYear2 ? "윤년입니다" : "윤년이 아닙니다";
//        }
//        System.out.println((year+"년은"+result2));

        // 음수 걸러내는 부분 추가 #2 - 중첩ㅂ 삼항연산자
        String result3 = year < 0 ? "불가능한 연도 입력입니다." :
                ((year%4 == 0) && (year%100 != 0)) || (year%400 == 0) ? "윤년입니다." :"윤년이 아닙니다.";

        System.out.println((year+"년은"+result3));
    }
}

package ch07_methods;
/*
    별찍기 관련 부분을 저희가 메서드화 시켜볼 예정입니다.
 */

import java.util.Scanner;

public class Method08StarWriting3 {

    // method 정의 영역
    public static String getStar() {

        String result = "";

        // 사용할 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용할 변수 선언
        int rowOfStars = 0;  // 몇 줄짜리 만들건지
        int choice = 0;      // 증가하는 별인지 감소하는 별인지 etc
        String starResult = ""; // 별은 String 자료형이라서 이런식으로 선언 및 초기화

        System.out.print("몇 줄 짜리 별을 생성하겠습니까? >>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("어떤 유형의 별을 생성하시겠습니까? >>> ");
        choice = scanner.nextInt();


        switch (choice) {
            case 1 :  // 왼쪽으로 치우친 증가
                for(int i = 1 ; i < rowOfStars+1 ; i++) {
                    for (int j = 0; j < i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            case 2 :   // 오른쪽으로 치우친 증가
                for(int i = 1 ; i < rowOfStars+1 ; i++) {
                    for (int j = 0; j < rowOfStars+1; j++) {
                        if (j < (rowOfStars+1 - i)) result += " ";
                        else result += "*";
                    }
                    result += "\n";
                }
                break;

            case 3 :    // 왼쪽으로 치우친 감소
                for(int i = rowOfStars ; i > 0 ; i--) {
                    for(int j = 0 ; j < i ; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            case 4 :    // 오른쪽으로 치우친 감소
                for(int i = rowOfStars ; i > 0 ; i--) {
                    for (int j = 0; j < rowOfStars ; j++) {
                        if(j < (rowOfStars+ - i)) result += " ";
                        else result += "*";
                    }
                    result += "\n";
                }
                break;

            default :
                System.out.println("유형입력을 잘못하셨습니다. 1-4에서 선택해주세요!");
        }


        return result;
    }

    //method 호출 영역
    public static void main(String[] args) {
//        // getStar() 메서드가 2번 실행될 수 있도록 반복문 작성하시오
//        int i = 0;
//
//        while (i < 2) {
//            System.out.println(getStar());
//            i++;
//        }
//
//        for (int j = 0; j < 2; j++) {
//            System.out.println(getStar());
//        }

        // while문의 경우 횟수를 고정시키기 보다는 특정 조건에 맞춰서 진행된다고 했습니다.
        // 그 부분에 대한 예시입니다.

        boolean continued = true;

        while(continued) {
            System.out.println(getStar());
            System.out.print("계속하시겠습니까? Yes면 1, 아니면 0을 선택하세요. >>> ");

            Scanner scanner = new Scanner(System.in);

            int answer = scanner.nextInt();

            switch (answer) {
                case 1 :
                    break;
                case 0 :
                    continued = !continued;
                    break;
                default:
                    System.out.println("불가능한 선택입니다. 0과 1중에 선택해주세요.");
                    continued = !continued;
            }
        }
    }
}
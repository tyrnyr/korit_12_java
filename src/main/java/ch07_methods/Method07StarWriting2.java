package ch07_methods;
/*
    별찍기 관련 부분을 저희가 메서드화 시켜볼 예정입니다.
 */

import java.util.Scanner;

public class Method07StarWriting2 {
    // call() 유형으로 작성할 예정 -> 몇 줄 짜리 별 찍을건지
    // 어떤 유형의 별찍기를 할건지 main에서 받을 예정이기 때문에
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

        // 메서드 호출
        System.out.println(getStar());
    }
}
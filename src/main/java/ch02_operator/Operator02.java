package ch02_operator;
/*
    논리 연산자
    true(1) / false(0) : 컴퓨터가 읽을 수 있는 두 숫자
    boolean : true / false 구분하는 자료형

    AND(&&) : 곱연산자 하나라도 Fasle면 False
    OR(||)  : 합연산자 하나라도 True면 True
    NOT(!)  : true값을 false, false값을 true로
 */
public class Operator02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println("-------&& 연산자-------");
        boolean result1 = flag1 && flag1;
        System.out.println("T x T = " + result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T x F = " + result2);
        boolean result3 = flag2 && flag2;
        System.out.println("F x F = " + result3);

        System.out.println("-------|| 연산자-------");
        boolean result4 = flag1 || flag1;
        System.out.println("T + T = " + result4);
        boolean result5 = flag1 || flag2;
        System.out.println("T + F = " + result5);
        boolean result6 = flag2 || flag2;
        System.out.println("F + F = " + result6);

        //ch03_scanner 패키지 생성 / Scanner01 클래스 생성 -> main 적용
    }
}
